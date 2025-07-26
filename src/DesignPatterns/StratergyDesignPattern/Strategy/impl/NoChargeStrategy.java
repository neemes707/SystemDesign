package DesignPatterns.StratergyDesignPattern.Strategy.impl;

import DesignPatterns.StratergyDesignPattern.Strategy.ChargingStrategy;

public class NoChargeStrategy implements ChargingStrategy {
    @Override
    public void charge(){
        System.out.println("Charging not available");
    }

}
