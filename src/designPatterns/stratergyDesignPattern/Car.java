package designPatterns.stratergyDesignPattern;

import designPatterns.stratergyDesignPattern.Strategy.ChargingStrategy;
import designPatterns.stratergyDesignPattern.Strategy.DrivingStrategy;
import designPatterns.stratergyDesignPattern.Strategy.FlyingStrategy;

public class Car extends Vehicle{
    Car(){};
    Car(DrivingStrategy drivingStrategy,FlyingStrategy flyingStrategy,ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);
    }


}
