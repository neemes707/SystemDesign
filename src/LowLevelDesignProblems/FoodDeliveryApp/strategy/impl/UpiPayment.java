package LowLevelDesignProblems.FoodDeliveryApp.strategy.impl;

import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

public class UpiPayment implements PaymentStrategy {
    private String upiId;
    UpiPayment(String upiId){
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount){
        System.out.println("Payment of " + amount +" made through UPI from upiId " + upiId);
    }
}