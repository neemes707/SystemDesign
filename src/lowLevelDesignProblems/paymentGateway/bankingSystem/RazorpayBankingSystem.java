package lowLevelDesignProblems.paymentGateway.bankingSystem;

import java.util.Random;

public class RazorpayBankingSystem implements IBankingSystem{
    private Random random = new Random();
    @Override
    public boolean processPayment(double amount) {
        return random.nextInt(100) < 20; // this will have 20 % probability to return true
    }
}
