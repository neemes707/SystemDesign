package lowLevelDesignProblems.foodDeliveryApp.service;

import lowLevelDesignProblems.foodDeliveryApp.models.MenuItems;
import lowLevelDesignProblems.foodDeliveryApp.models.Restaurant;

import java.util.List;
import java.util.UUID;

public class Cart {
    private String id;
    private List<MenuItems> menuItemsList;
    private Restaurant restaurant;
    private double totalCost;

    public Cart(List<MenuItems> menuItemsList, Restaurant restaurant, double totalCost) {
        this.id = UUID.randomUUID().toString();
        this.menuItemsList = menuItemsList;
        this.restaurant = restaurant;
        this.totalCost = totalCost;
    }

    public List<MenuItems> getMenuItemsList() {
        return menuItemsList;
    }

    public void setMenuItemsList(List<MenuItems> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void addMenuItemToCart(MenuItems menuItem){
        menuItemsList.add(menuItem);
        this.totalCost += menuItem.getPrice();
    }


}
