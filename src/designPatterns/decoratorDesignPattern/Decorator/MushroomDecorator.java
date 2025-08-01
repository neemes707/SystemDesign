package designPatterns.decoratorDesignPattern.Decorator;

import designPatterns.decoratorDesignPattern.Component.FoodItem;

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
