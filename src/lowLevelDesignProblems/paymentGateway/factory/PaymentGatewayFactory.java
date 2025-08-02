package lowLevelDesignProblems.paymentGateway.factory;

import lowLevelDesignProblems.paymentGateway.enums.PaymentGatewayType;
import lowLevelDesignProblems.paymentGateway.gateway.IPaymentGateway;
import lowLevelDesignProblems.paymentGateway.gateway.PaytmPaymentGateway;
import lowLevelDesignProblems.paymentGateway.gateway.ProxyPaymentGateway;
import lowLevelDesignProblems.paymentGateway.gateway.RazorpayPaymentGateway;

public class PaymentGatewayFactory {
    public static IPaymentGateway getPaymentGateway(PaymentGatewayType paymentGatewayType){
        if(paymentGatewayType == PaymentGatewayType.RAZORPAY){
            return new ProxyPaymentGateway(new RazorpayPaymentGateway(),1);
        } else if(paymentGatewayType == PaymentGatewayType.PAYTM){
            return new ProxyPaymentGateway(new PaytmPaymentGateway(),3);
        }
        return null;
    }
}
