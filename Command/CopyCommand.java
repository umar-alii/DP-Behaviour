public class CopyCommand implements Command {
    private final Clipboard clipboard;
    private final TextEditor textEditor;

    public CopyCommand(Clipboard clipboard, TextEditor textEditor) {
        this.clipboard = clipboard;
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        clipboard.setContent(textEditor.getSelectedText());
    }
}