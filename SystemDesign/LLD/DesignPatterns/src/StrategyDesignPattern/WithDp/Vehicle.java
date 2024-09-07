package StrategyDesignPattern.WithDp;

public class Vehicle {
    protected DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy  = driveStrategy;
    }
    protected void drive(){
        driveStrategy.drive();
    }

}
