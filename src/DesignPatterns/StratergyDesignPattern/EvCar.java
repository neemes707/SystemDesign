package DesignPatterns.StratergyDesignPattern;

import DesignPatterns.StratergyDesignPattern.Strategy.ChargingStrategy;
import DesignPatterns.StratergyDesignPattern.Strategy.DrivingStrategy;
import DesignPatterns.StratergyDesignPattern.Strategy.FlyingStrategy;

public class EvCar extends Vehicle {
    EvCar(DrivingStrategy drivingStrategy, FlyingStrategy flyingStrategy,ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);

    }
}
