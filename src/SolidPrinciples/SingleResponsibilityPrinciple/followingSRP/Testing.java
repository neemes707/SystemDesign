package SolidPrinciples.SingleResponsibilityPrinciple.followingSRP;

public class Testing {
    public static void main(String[] args) {
        Invoice  invoice = new Invoice("Marker",10,15);
        InvoicePrinter printer = new InvoicePrinter(invoice);
        InvoicePersistence persistence = new InvoicePersistence(invoice);

        System.out.println(invoice.calculateTotal());
        printer.print();
        persistence.saveToFile();

    }
}
