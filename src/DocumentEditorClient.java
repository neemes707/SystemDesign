//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DocumentEditorClient {
    public static void main(String[] args) {
        Document document = new Document();
        Persistence persistence = new DbPersistence();

        DocumentEditor documentEditor = new DocumentEditor(persistence,document);
        documentEditor.addText("Hello");
        documentEditor.addImage("/c/desktop/macintosh");

        documentEditor.render();

        documentEditor.saveDocument();

    }
}