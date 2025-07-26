package DesignPatterns.StratergyDesignPattern.Strategy.impl;

import DesignPatterns.StratergyDesignPattern.Strategy.FlyingStrategy;

public class NormalFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Normal flying strategy");
    }
}
