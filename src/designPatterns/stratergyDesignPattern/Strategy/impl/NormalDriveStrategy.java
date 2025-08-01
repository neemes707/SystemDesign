package designPatterns.stratergyDesignPattern.Strategy.impl;

import designPatterns.stratergyDesignPattern.Strategy.DrivingStrategy;

public class NormalDriveStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving normally");
    }
}
