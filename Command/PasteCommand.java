public class PasteCommand implements Command {
    private final Clipboard clipboard;
    private final TextEditor textEditor;

    public PasteCommand(Clipboard clipboard, TextEditor textEditor) {
        this.clipboard = clipboard;
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.insertText(clipboard.getContent());
    }
}