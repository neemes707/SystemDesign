package StratergyDesignPattern.Strategy.impl;

import StratergyDesignPattern.Strategy.FlyingStrategy;

public class NormalFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Normal flying strategy");
    }
}
