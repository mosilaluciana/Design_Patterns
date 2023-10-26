package command;

class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public boolean execute() {
        app.undo();
        return false;
    }
}