package command;

class Editor {
    String text;

    public String getSelection() {
        // Return selected text.
        return text;
    }

    public void deleteSelection() {
        // Delete selected text.
        text = "";
    }

    public void replaceSelection(String text) {
        // Insert the clipboard's contents at the current position.
        this.text = text;
    }
}