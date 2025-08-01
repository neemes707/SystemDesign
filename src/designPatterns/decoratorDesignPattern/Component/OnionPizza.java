package designPatterns.decoratorDesignPattern.Component;

public class OnionPizza implements FoodItem{
    @Override
    public double getPrice() {
        return 120;
    }
}
