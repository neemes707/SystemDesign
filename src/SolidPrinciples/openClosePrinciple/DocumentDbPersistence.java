package SolidPrinciples.openClosePrinciple;

public class DocumentDbPersistence implements Persistence {
    private Invoice invoice;
    public DocumentDbPersistence(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void save() {
        System.out.println("saved in document db");
    }
}
