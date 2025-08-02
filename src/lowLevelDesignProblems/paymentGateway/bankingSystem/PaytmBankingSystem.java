package lowLevelDesignProblems.paymentGateway.bankingSystem;

import java.util.Random;

public class PaytmBankingSystem implements IBankingSystem{
    private Random random = new Random(); // this will generate a random number
    @Override
    public boolean processPayment(double amount) {
        int r = random.nextInt(100);
        return r < 80; // this will have 80 % probability to return true, this is just to test out retry capability functionality
    }
}
