package DocumentEditor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> documentElementList;

    Document(){
        this.documentElementList = new ArrayList<>();
    }

    public List<DocumentElement> getDocumentList(){
        return documentElementList;
    }
    public void setDocumentElementList(List<DocumentElement> documentElementList){
        this.documentElementList = documentElementList;
    }

    void render(){
        StringBuilder str = new StringBuilder();
        for(DocumentElement element : documentElementList){
            str.append(element.render()).append("\n");

        }
        System.out.println(str);
    }
    void addElement(DocumentElement element){
        documentElementList.add(element);
    }



}
