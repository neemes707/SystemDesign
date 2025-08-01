package designPatterns.stratergyDesignPattern;

import designPatterns.stratergyDesignPattern.Strategy.ChargingStrategy;
import designPatterns.stratergyDesignPattern.Strategy.DrivingStrategy;
import designPatterns.stratergyDesignPattern.Strategy.FlyingStrategy;

public class EvCar extends Vehicle {
    EvCar(DrivingStrategy drivingStrategy, FlyingStrategy flyingStrategy,ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);

    }
}
