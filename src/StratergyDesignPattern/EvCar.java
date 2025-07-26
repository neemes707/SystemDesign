package StratergyDesignPattern;

import StratergyDesignPattern.Strategy.ChargingStrategy;
import StratergyDesignPattern.Strategy.DrivingStrategy;
import StratergyDesignPattern.Strategy.FlyingStrategy;

public class EvCar extends Vehicle {
    EvCar(DrivingStrategy drivingStrategy, FlyingStrategy flyingStrategy,ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);

    }
}
