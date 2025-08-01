package designPatterns.stratergyDesignPattern.Strategy.impl;

import designPatterns.stratergyDesignPattern.Strategy.FlyingStrategy;

public class NormalFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Normal flying strategy");
    }
}
