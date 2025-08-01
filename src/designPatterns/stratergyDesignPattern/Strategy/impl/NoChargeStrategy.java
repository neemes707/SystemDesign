package designPatterns.stratergyDesignPattern.Strategy.impl;

import designPatterns.stratergyDesignPattern.Strategy.ChargingStrategy;

public class NoChargeStrategy implements ChargingStrategy {
    @Override
    public void charge(){
        System.out.println("Charging not available");
    }

}
