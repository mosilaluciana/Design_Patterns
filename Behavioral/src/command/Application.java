package command;
import java.util.ArrayList;
import java.util.List;

class Application {
    String clipboard;
    List<Editor> editors;
    Editor activeEditor;
    CommandHistory history = new CommandHistory();


    public void createUI() {
        Runnable copy = () -> executeCommand(new CopyCommand(this, activeEditor));
        copyButton.setCommand(copy);
        shortcuts.onKeyPress("Ctrl+C", copy);

        Runnable cut = () -> executeCommand(new CutCommand(this, activeEditor));
        cutButton.setCommand(cut);
        shortcuts.onKeyPress("Ctrl+X", cut);

        Runnable paste = () -> executeCommand(new PasteCommand(this, activeEditor));
        pasteButton.setCommand(paste);
        shortcuts.onKeyPress("Ctrl+V", paste);

        Runnable undo = () -> executeCommand(new UndoCommand(this, activeEditor));
        undoButton.setCommand(undo);
        shortcuts.onKeyPress("Ctrl+Z", undo);
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}