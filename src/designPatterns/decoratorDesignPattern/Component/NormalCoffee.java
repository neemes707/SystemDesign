package designPatterns.decoratorDesignPattern.Component;

public class NormalCoffee implements FoodItem{
    @Override
    public double getPrice(){
        return 70;
    }
}
