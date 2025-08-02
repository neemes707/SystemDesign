package lowLevelDesignProblems.foodDeliveryApp.service;

import java.util.UUID;

public class User {
    private String userId;
    private String name;
    private String address;
    private Cart cart;

    public User(String name, String address, Cart cart) {
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.cart = cart;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
