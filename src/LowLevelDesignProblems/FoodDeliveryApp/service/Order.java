package LowLevelDesignProblems.FoodDeliveryApp.service;

import LowLevelDesignProblems.FoodDeliveryApp.models.MenuItems;
import LowLevelDesignProblems.FoodDeliveryApp.models.Restaurant;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.NotificationStrategy;
import LowLevelDesignProblems.FoodDeliveryApp.strategy.PaymentStrategy;

import java.sql.SQLOutput;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private Restaurant restaurant;
    private User user;
    private PaymentStrategy paymentStrategy;
    private List<MenuItems> menuItemsList;
    private String orderType;

    public Order(Restaurant restaurant, User user, PaymentStrategy paymentStrategy, List<MenuItems> menuItemsList, String orderType) {
        this.id = UUID.randomUUID().toString();
        this.restaurant = restaurant;
        this.user = user;
        this.paymentStrategy = paymentStrategy;
        this.menuItemsList = menuItemsList;
        this.orderType = orderType;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public List<MenuItems> getMenuItemsList() {
        return menuItemsList;
    }

    public void setMenuItemsList(List<MenuItems> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public boolean makePayment(double amount){
        if(paymentStrategy == null){
            System.out.println("Select paymentStrategy first");
            return false;
        }else {
            paymentStrategy.pay(amount);
            return true;
        }

    }
}
