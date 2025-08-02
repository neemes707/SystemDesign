package lowLevelDesignProblems.paymentGateway.service;

import lowLevelDesignProblems.paymentGateway.gateway.IPaymentGateway;
import lowLevelDesignProblems.paymentGateway.model.Payment;

public class PaymentGatewayService {
    private IPaymentGateway paymentGateway;
    private static PaymentGatewayService paymentGatewayService;
    private PaymentGatewayService(){
    }

    public static PaymentGatewayService getInstance(){
        if(paymentGatewayService  == null){
            synchronized (PaymentGatewayService.class){
                if(paymentGatewayService == null){
                    paymentGatewayService = new PaymentGatewayService();
                }
            }
        }
        return paymentGatewayService;
    }

    public IPaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(IPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(Payment payment){
        return paymentGateway.processPayment(payment);
    }

}
