package command;

class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }
}