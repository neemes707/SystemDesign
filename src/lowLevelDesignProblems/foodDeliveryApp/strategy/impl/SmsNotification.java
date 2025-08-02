package lowLevelDesignProblems.foodDeliveryApp.strategy.impl;

import lowLevelDesignProblems.foodDeliveryApp.service.Order;
import lowLevelDesignProblems.foodDeliveryApp.strategy.NotificationStrategy;

public class SmsNotification implements NotificationStrategy {
    private String mobileNumber;
    private Order order;
    public SmsNotification(String mobileNumber,Order order){
        this.mobileNumber = mobileNumber;
        this.order = order;

    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
