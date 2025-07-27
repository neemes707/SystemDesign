package LowLevelDesignProblems.FoodDeliveryApp.models;

import java.util.List;
import java.util.UUID;

public class Restaurant {
    private final String restaurantId;
    private String name;
    private String address;
    private List<MenuItems> menuItemsList;

    public Restaurant(String name, String address, List<MenuItems> menuItemsList) {
        this.restaurantId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.menuItemsList = menuItemsList;
    }

    public String getRestaurantId() {
        return restaurantId;
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

    public List<MenuItems> getMenuItemsList() {
        return menuItemsList;
    }

    public void setMenuItemsList(List<MenuItems> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }
}
