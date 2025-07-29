package DesignPatterns.DecoratorDesignPattern.Decorator;

import DesignPatterns.DecoratorDesignPattern.Component.FoodItem;

public class ExtraMilk implements Decorators{
    private FoodItem foodItem;
    public ExtraMilk(FoodItem foodItem){
        this.foodItem = foodItem;
    }
    @Override
    public double getPrice(){
        return foodItem.getPrice() + 40;
    }
}
