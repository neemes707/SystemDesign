package LowLevelDesignProblems.FoodDeliveryApp.strategy.impl;

import LowLevelDesignProblems.FoodDeliveryApp.strategy.NotificationStrategy;

public class EmailNotification implements NotificationStrategy {
    private String email;
    EmailNotification(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message){
        System.out.println(message + "sent on mail " + email);
    }
}
