public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private String lastState = "";

    public void setText(String newText) {
        saveState();
        text = new StringBuilder(newText);
    }

    public String getText() {
        return text.toString();
    }

    public String getSelectedText() {
        // For simplicity, return a substring (e.g., first 5 characters)
        return text.substring(0, Math.min(5, text.length()));
    }

    public void deleteSelectedText() {
        saveState();
        text.delete(0, Math.min(5, text.length()));
    }

    public void insertText(String newText) {
        saveState();
        text.insert(0, newText);
    }

    public void undo() {
        text = new StringBuilder(lastState);
    }

    private void saveState() {
        lastState = text.toString();
    }
}