package DesignPatterns.DecoratorDesignPattern;

import DesignPatterns.DecoratorDesignPattern.Component.FoodItem;
import DesignPatterns.DecoratorDesignPattern.Component.NormalCoffee;
import DesignPatterns.DecoratorDesignPattern.Component.OnionPizza;
import DesignPatterns.DecoratorDesignPattern.Decorator.ExtraCheeseDecorator;
import DesignPatterns.DecoratorDesignPattern.Decorator.ExtraCream;
import DesignPatterns.DecoratorDesignPattern.Decorator.MushroomDecorator;

public class TestingDecoratorPattern {
    public static void main(String[] args) {

        FoodItem pizza = new MushroomDecorator(new ExtraCheeseDecorator(new OnionPizza()));
        System.out.println("Our decorated pizza price is " + pizza.getPrice());
        // in this way we can decorate as many items as we want and we can add new decorators as well

        FoodItem coffee = new ExtraCream(new ExtraCream(new NormalCoffee()));
        System.out.println("Our custom made coffee price is " + coffee.getPrice());
    }
}
