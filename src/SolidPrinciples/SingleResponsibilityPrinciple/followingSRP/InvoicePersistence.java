package SolidPrinciples.SingleResponsibilityPrinciple.followingSRP;

public class InvoicePersistence {
    private Invoice invoice;
    public InvoicePersistence(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToFile() {
        // This would be file/database logic
        System.out.println("Saving invoice for: " + invoice.getItem());
    }
}

