public class CutCommand implements Command {
    private final Clipboard clipboard;
    private final TextEditor textEditor;

    public CutCommand(Clipboard clipboard, TextEditor textEditor) {
        this.clipboard = clipboard;
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        clipboard.setContent(textEditor.getSelectedText());
        textEditor.deleteSelectedText();
    }
}