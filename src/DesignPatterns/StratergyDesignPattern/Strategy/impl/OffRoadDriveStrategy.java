package DesignPatterns.StratergyDesignPattern.Strategy.impl;

import DesignPatterns.StratergyDesignPattern.Strategy.DrivingStrategy;

public class OffRoadDriveStrategy implements DrivingStrategy {
    @Override
    public void drive(){
        System.out.println("Off road drive capability");
    }

}
