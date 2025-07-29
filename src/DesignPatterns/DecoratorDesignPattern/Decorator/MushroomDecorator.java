package DesignPatterns.DecoratorDesignPattern.Decorator;

import DesignPatterns.DecoratorDesignPattern.Component.FoodItem;

public class MushroomDecorator implements Decorators{
    private FoodItem foodItem;
    public MushroomDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }
    @Override
    public double getPrice(){
        return foodItem.getPrice() + 180;
    }
}
