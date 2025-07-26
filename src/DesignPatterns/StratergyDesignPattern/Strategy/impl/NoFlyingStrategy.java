package DesignPatterns.StratergyDesignPattern.Strategy.impl;

import DesignPatterns.StratergyDesignPattern.Strategy.FlyingStrategy;

public class NoFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Not having flying capability");
    }

}
