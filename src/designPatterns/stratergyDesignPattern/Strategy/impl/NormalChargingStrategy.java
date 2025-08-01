package designPatterns.stratergyDesignPattern.Strategy.impl;

import designPatterns.stratergyDesignPattern.Strategy.ChargingStrategy;

public class NormalChargingStrategy implements ChargingStrategy {
    @Override
    public void charge() {
        System.out.println("Charging a vehicle");
    }
}
