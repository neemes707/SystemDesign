package designPatterns.stratergyDesignPattern.Strategy.impl;

import designPatterns.stratergyDesignPattern.Strategy.DrivingStrategy;

public class OffRoadDriveStrategy implements DrivingStrategy {
    @Override
    public void drive(){
        System.out.println("Off road drive capability");
    }

}
