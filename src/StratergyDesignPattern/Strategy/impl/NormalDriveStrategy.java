package StratergyDesignPattern.Strategy.impl;

import StratergyDesignPattern.Strategy.DrivingStrategy;

public class NormalDriveStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving normally");
    }
}
