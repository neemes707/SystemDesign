public class ImageDocumentElement implements DocumentElement {
    ImageDocumentElement(){
        this.path = "";
    }
    ImageDocumentElement(String path){
        this.path = path;
    }
    String path;
    @Override
    public String render() {
        return path;
    }
}
