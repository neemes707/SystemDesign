package lowLevelDesignProblems.paymentGateway.gateway;

import lowLevelDesignProblems.paymentGateway.model.Payment;

public interface IPaymentGateway {
    boolean initiate(Payment payment);
    boolean validate(Payment payment);
    boolean confirm(Payment payment);
    default boolean processPayment(Payment payment){
        if(!validate(payment)){
            System.out.println("Payment validation failed");
            return false;
        }
        if(!initiate(payment)){
            System.out.println("Payment initiation failed");
            return false;
        }
        if(!confirm(payment)){
            System.out.println("Payment confirmation failed");
        }
        return true;
    }
}
