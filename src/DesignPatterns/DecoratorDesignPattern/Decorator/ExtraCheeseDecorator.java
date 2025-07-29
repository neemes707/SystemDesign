package DesignPatterns.DecoratorDesignPattern.Decorator;

import DesignPatterns.DecoratorDesignPattern.Component.FoodItem;

public class ExtraCheeseDecorator implements Decorators{
    private FoodItem foodItem;
    public ExtraCheeseDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }
    @Override
    public double getPrice() {
        return foodItem.getPrice() + 30;
    }
}
