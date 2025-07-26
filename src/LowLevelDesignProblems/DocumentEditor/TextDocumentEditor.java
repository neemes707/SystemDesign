package LowLevelDesignProblems.DocumentEditor;

public class TextDocumentEditor implements DocumentElement{
    String text;
    TextDocumentEditor(){
        this.text = "";
    }
    TextDocumentEditor(String text){
        this.text = text;
    }
    @Override
    public String render() {
        return "[ + " + text + " ]";
    }
}
