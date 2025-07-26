package DesignPatterns.StratergyDesignPattern.Strategy.impl;

import DesignPatterns.StratergyDesignPattern.Strategy.ChargingStrategy;

public class NormalChargingStrategy implements ChargingStrategy {
    @Override
    public void charge() {
        System.out.println("Charging a vehicle");
    }
}
