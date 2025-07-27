package LowLevelDesignProblems.FoodDeliveryApp.strategy.impl;

import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

public class NetBanking implements PaymentStrategy {
    private String cardNumber;
    NetBanking(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println("Payment of " + amount + " made through Net Banking from card " + cardNumber);
    }
}
