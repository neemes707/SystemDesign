package LowLevelDesignProblems.FoodDeliveryApp.strategy.impl;

import LowLevelDesignProblems.FoodDeliveryApp.strategy.NotificationStrategy;

public class SmsNotification implements NotificationStrategy {
    private String mobileNumber;

    SmsNotification(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void notify(String message){
        System.out.println(message + "sent through message on mobile number " + mobileNumber);
    }
}
