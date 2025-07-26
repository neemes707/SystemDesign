package StratergyDesignPattern;

import StratergyDesignPattern.Strategy.ChargingStrategy;
import StratergyDesignPattern.Strategy.DrivingStrategy;
import StratergyDesignPattern.Strategy.FlyingStrategy;

public class Car extends Vehicle{
    Car(){};
    Car(DrivingStrategy drivingStrategy,FlyingStrategy flyingStrategy,ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);
    }


}
