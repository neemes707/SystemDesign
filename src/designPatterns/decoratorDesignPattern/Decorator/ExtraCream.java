package designPatterns.decoratorDesignPattern.Decorator;

import designPatterns.decoratorDesignPattern.Component.FoodItem;

public class ExtraCream implements Decorators {
    private FoodItem foodItem;

    public ExtraCream(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + 80;
    }
}
