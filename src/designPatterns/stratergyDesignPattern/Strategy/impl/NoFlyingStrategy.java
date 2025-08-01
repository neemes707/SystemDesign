package designPatterns.stratergyDesignPattern.Strategy.impl;

import designPatterns.stratergyDesignPattern.Strategy.FlyingStrategy;

public class NoFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly(){
        System.out.println("Not having flying capability");
    }

}
