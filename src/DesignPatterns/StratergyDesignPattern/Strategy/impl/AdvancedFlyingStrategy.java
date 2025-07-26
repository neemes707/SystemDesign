package DesignPatterns.StratergyDesignPattern.Strategy.impl;

import DesignPatterns.StratergyDesignPattern.Strategy.FlyingStrategy;

public class AdvancedFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Flying strategy for advanced flying vehicles");
    }

}
