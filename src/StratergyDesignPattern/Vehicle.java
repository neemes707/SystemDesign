package StratergyDesignPattern;

import StratergyDesignPattern.Strategy.ChargingStrategy;
import StratergyDesignPattern.Strategy.DrivingStrategy;
import StratergyDesignPattern.Strategy.FlyingStrategy;


public class Vehicle {
    private DrivingStrategy drivingStrategy;
    private FlyingStrategy flyingStrategy;
    private ChargingStrategy chargingStrategy;

    public Vehicle(){}

    public Vehicle(DrivingStrategy drivingStrategy,FlyingStrategy flyingStrategy,ChargingStrategy chargingStrategy){
        this.drivingStrategy = drivingStrategy;
        this.flyingStrategy = flyingStrategy;
        this.chargingStrategy = chargingStrategy;
    }
    public void driveVehicle(){
        drivingStrategy.drive();
    }
    public  void flyVehicle(){
        flyingStrategy.fly();
    }

    public void chargeVehicle(){
        chargingStrategy.charge();
    }

    public void info(){
        System.out.println("Generic Vehicle");
    }

}
