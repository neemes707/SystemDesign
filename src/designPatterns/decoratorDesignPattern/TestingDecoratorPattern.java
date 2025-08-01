package designPatterns.decoratorDesignPattern;

import designPatterns.decoratorDesignPattern.Component.FoodItem;
import designPatterns.decoratorDesignPattern.Component.NormalCoffee;
import designPatterns.decoratorDesignPattern.Component.OnionPizza;
import designPatterns.decoratorDesignPattern.Decorator.ExtraCheeseDecorator;
import designPatterns.decoratorDesignPattern.Decorator.ExtraCream;
import designPatterns.decoratorDesignPattern.Decorator.MushroomDecorator;

public class TestingDecoratorPattern {
    public static void main(String[] args) {

        FoodItem pizza = new MushroomDecorator(new ExtraCheeseDecorator(new OnionPizza()));
        System.out.println("Our decorated pizza price is " + pizza.getPrice());
        // in this way we can decorate as many items as we want and we can add new decorators as well

        FoodItem coffee = new ExtraCream(new ExtraCream(new NormalCoffee()));
        System.out.println("Our custom made coffee price is " + coffee.getPrice());
    }
}
