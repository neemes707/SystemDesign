package lowLevelDesignProblems.foodDeliveryApp.models;

import java.util.UUID;

public class MenuItems {
    private final String id;
    private String code;
    private String name;
    private double price;

    public MenuItems(String code, String name, double price) {
        this.id = UUID.randomUUID().toString();
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
