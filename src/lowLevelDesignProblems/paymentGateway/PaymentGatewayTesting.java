package lowLevelDesignProblems.paymentGateway;

import lowLevelDesignProblems.paymentGateway.enums.PaymentGatewayType;
import lowLevelDesignProblems.paymentGateway.factory.PaymentGatewayFactory;
import lowLevelDesignProblems.paymentGateway.gateway.IPaymentGateway;
import lowLevelDesignProblems.paymentGateway.model.Payment;
import lowLevelDesignProblems.paymentGateway.service.PaymentGatewayService;
/** Functional Requirement
 * Payment gateway should be extensible - in future we could add new type of payment gateway with minimum code changes
 * All Payment gateway should follow payment methods in a defined fashion or fixed order
 * If payment fails, out payment gateway should have retry facility
 * */
public class PaymentGatewayTesting {
    public static void main(String[] args) {

        PaymentGatewayService paymentGatewayService = PaymentGatewayService.getInstance();

        IPaymentGateway paymentGateway = PaymentGatewayFactory.getPaymentGateway(PaymentGatewayType.RAZORPAY);
        paymentGatewayService.setPaymentGateway(paymentGateway);

        boolean b = paymentGatewayService.processPayment(
                new Payment("Aman", "Arpit", "INR", 128));

        System.out.println(b);


    }
}
