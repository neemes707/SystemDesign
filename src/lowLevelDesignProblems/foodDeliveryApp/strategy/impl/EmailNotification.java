package lowLevelDesignProblems.foodDeliveryApp.strategy.impl;

import lowLevelDesignProblems.foodDeliveryApp.service.Order;
import lowLevelDesignProblems.foodDeliveryApp.strategy.NotificationStrategy;

public class EmailNotification implements NotificationStrategy {
    private String email;
    private Order order;
    public EmailNotification(String email,Order order){
        this.email = email;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
