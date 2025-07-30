package SolidPrinciples.openClosePrinciple;

public class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("Item: " + invoice.getItem());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: $" + invoice.getPricePerItem());
        System.out.println("Total: $" + invoice.calculateTotal());
    }
}

