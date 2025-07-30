package SolidPrinciples.SingleResponsibilityPrinciple.violatingSRP;

public class Invoice {
    private String item;
    private int quantity;
    private double pricePerItem;

    public Invoice(String item, int quantity, double pricePerItem) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double calculateTotal() {

        double subTotal =  quantity * pricePerItem; // total
        return subTotal * 0.18 * subTotal;
    }

    public void printInvoice() {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + calculateTotal());
    }

    public void saveToFile() {
        System.out.println("Saving invoice to file...");
        // file saving logic
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}

