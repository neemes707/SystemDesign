package DesignPatterns.FactorDesignPattern.model;

public class Vehicle {
    private int wheels;
    private String color;
    public Vehicle(){}

    public Vehicle(int wheels, String  color) {
        this.wheels = wheels;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String  getColor() {
        return color;
    }

    public void setColor(String  color) {
        this.color = color;
    }
}
