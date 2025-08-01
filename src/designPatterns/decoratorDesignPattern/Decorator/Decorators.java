package designPatterns.decoratorDesignPattern.Decorator;

import designPatterns.decoratorDesignPattern.Component.FoodItem;

public interface Decorators extends FoodItem {
    double getPrice();
}
