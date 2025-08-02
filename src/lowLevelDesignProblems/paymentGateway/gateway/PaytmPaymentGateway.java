package lowLevelDesignProblems.paymentGateway.gateway;

import lowLevelDesignProblems.paymentGateway.bankingSystem.IBankingSystem;
import lowLevelDesignProblems.paymentGateway.bankingSystem.PaytmBankingSystem;
import lowLevelDesignProblems.paymentGateway.model.Payment;

public class PaytmPaymentGateway implements IPaymentGateway{
    private final IBankingSystem bankingSystem;

    public PaytmPaymentGateway() {
        bankingSystem = new PaytmBankingSystem();
    }

    public IBankingSystem getBankingSystem() {
        return bankingSystem;
    }

    @Override
    public boolean validate(Payment payment) {
        System.out.println("[Paytm]:Validating payment from " + payment.getSenderName());
        if(payment.getAmount() < 0 || payment.getCurrencyType().equalsIgnoreCase("INR")){
            System.out.println("[Paytm]:Validation failed");
            return false;
        }else{
            System.out.println("[Paytm]:Validation passed");
            return true;
        }
    }

    @Override
    public boolean initiate(Payment payment) {
        System.out.println("[Paytm]:initiating banking system to do payment of " + payment.getAmount());
        return bankingSystem.processPayment(payment.getAmount());
    }
    @Override
    public boolean confirm(Payment payment) {
        System.out.println("[Paytm] Confirming payment for " + payment.getSenderName() + ".");
        return true;
    }
}
