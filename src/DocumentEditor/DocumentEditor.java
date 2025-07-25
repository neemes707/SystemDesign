package DocumentEditor;

public class DocumentEditor {
    Persistence persistence;
    Document document;
    DocumentEditor(Persistence persistence, Document document){
        this.persistence = persistence;
        this.document = document;
    }

    void addText(String text){
        document.addElement(new TextDocumentEditor(text));
    }

    void addImage(String path){
        document.addElement(new ImageDocumentElement(path));
    }

    void saveDocument(){
        persistence.save();
    }

    void render(){
        document.render();
    }

}
