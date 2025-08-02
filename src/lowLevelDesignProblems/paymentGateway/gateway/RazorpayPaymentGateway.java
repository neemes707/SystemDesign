package lowLevelDesignProblems.paymentGateway.gateway;

import lowLevelDesignProblems.paymentGateway.bankingSystem.IBankingSystem;
import lowLevelDesignProblems.paymentGateway.bankingSystem.RazorpayBankingSystem;
import lowLevelDesignProblems.paymentGateway.model.Payment;

public class RazorpayPaymentGateway implements IPaymentGateway{
    private final IBankingSystem bankingSystem;

    public RazorpayPaymentGateway() {
        bankingSystem = new RazorpayBankingSystem();
    }

    public IBankingSystem getBankingSystem() {
        return bankingSystem;
    }

    @Override
    public boolean validate(Payment payment) {
        System.out.println("[Razorpay]:Validating payment from " + payment.getSenderName());
        if(payment.getAmount() < 0 ){
            System.out.println("[Razorpay]:Validation failed");
            return false;
        }else{
            System.out.println("[Razorpay]:Validation passed");
            return true;
        }
    }

    @Override
    public boolean initiate(Payment payment) {
        System.out.println("[Razorpay] : initiation done");
        return bankingSystem.processPayment(payment.getAmount());
    }

    @Override
    public boolean confirm(Payment payment) {
        System.out.println("[Razorpay]:Payment confirmed for " + payment.getSenderName());
        return true;
    }
}
