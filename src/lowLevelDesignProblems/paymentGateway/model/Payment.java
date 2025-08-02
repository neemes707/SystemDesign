package lowLevelDesignProblems.paymentGateway.model;

public class Payment {
    String senderName;
    String receiverName;
    String currencyType;
    double amount;

    public Payment(String senderName, String receiverName, String currencyType, double amount) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.currencyType = currencyType;
        this.amount = amount;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
