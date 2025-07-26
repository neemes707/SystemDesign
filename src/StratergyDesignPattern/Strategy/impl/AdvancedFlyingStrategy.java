package StratergyDesignPattern.Strategy.impl;

import StratergyDesignPattern.Strategy.FlyingStrategy;

public class AdvancedFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Flying strategy for advanced flying vehicles");
    }

}
