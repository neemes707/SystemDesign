package SolidPrinciples.openClosePrinciple;

public class InvoicePersistence {
    private Invoice invoice;
    public InvoicePersistence(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToFile() {
        // This would be file/database logic
        System.out.println("Saving invoice for: " + invoice.getItem());
    }
    public void saveToDb(){
        System.out.println("saving to db");
    }
}

