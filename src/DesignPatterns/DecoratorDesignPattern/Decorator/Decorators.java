package DesignPatterns.DecoratorDesignPattern.Decorator;

import DesignPatterns.DecoratorDesignPattern.Component.FoodItem;

public interface Decorators extends FoodItem {
    double getPrice();
}
