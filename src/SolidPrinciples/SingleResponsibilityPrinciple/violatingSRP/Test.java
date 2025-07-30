package SolidPrinciples.SingleResponsibilityPrinciple.violatingSRP;

public class Test {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Marker",10,15);

        System.out.println(invoice.calculateTotal());
        invoice.printInvoice();
        invoice.saveToFile();
    }
}
