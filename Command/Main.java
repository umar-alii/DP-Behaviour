public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Clipboard clipboard = new Clipboard();

        textEditor.setText("Hello World!");

        Command cutCommand = new CutCommand(clipboard, textEditor);
        Command copyCommand = new CopyCommand(clipboard, textEditor);
        Command pasteCommand = new PasteCommand(clipboard, textEditor);
        Command undoCommand = new UndoCommand(textEditor);

        Button cutButton = new Button(cutCommand);
        Button copyButton = new Button(copyCommand);
        Button pasteButton = new Button(pasteCommand);
        Button undoButton = new Button(undoCommand);

        copyButton.click();
        pasteButton.click();
        cutButton.click();
        undoButton.click();

        System.out.println("Final Text: " + textEditor.getText());
    }
}