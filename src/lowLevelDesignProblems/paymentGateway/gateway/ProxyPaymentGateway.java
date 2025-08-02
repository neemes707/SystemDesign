package lowLevelDesignProblems.paymentGateway.gateway;

import lowLevelDesignProblems.paymentGateway.model.Payment;
/**We have used this proxy payment gateway to implement retry mechanism
 * this proxy has the reference of the real payment gateway which was selected but the client does not know that it
 * got the proxy and in proxy it had instance of real paymentGateway */
public class ProxyPaymentGateway implements IPaymentGateway{
    private IPaymentGateway realPaymentGateway;
    private int retryCount;
    public ProxyPaymentGateway(IPaymentGateway paymentGateway,int retryCount){
        this.realPaymentGateway = paymentGateway;
        this.retryCount = retryCount;
    }

    public IPaymentGateway getRealPaymentGateway() {
        return realPaymentGateway;
    }

    public void setRealPaymentGateway(IPaymentGateway realPaymentGateway) {
        this.realPaymentGateway = realPaymentGateway;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public boolean initiate(Payment payment) {
        return realPaymentGateway.initiate(payment);
    }

    @Override
    public boolean validate(Payment payment) {
        return realPaymentGateway.validate(payment);
    }

    @Override
    public boolean confirm(Payment payment) {
        return realPaymentGateway.confirm(payment);
    }
    @Override
    public boolean processPayment(Payment payment){
        int retries = 0;

        while(retries <= retryCount) {
            if(realPaymentGateway.validate(payment)){
                break;
            }else{
                retries += 1;
                System.out.println("Validation failed : retry count " + retries);
            }
        }

        while(retries <= retryCount) {
            if(realPaymentGateway.initiate(payment)){
                break;
            }else{
                retries += 1;
                System.out.println("Validation failed : retry count " + retries);
            }
        }

        while(retries <= retryCount) {
            if(realPaymentGateway.confirm(payment)){
                return true;
            }else{
                retries += 1;
                System.out.println("Validation failed : retry count " + retries);
            }
        }
        return false;

    }
}
