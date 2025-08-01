package designPatterns.stratergyDesignPattern;

import designPatterns.stratergyDesignPattern.Strategy.ChargingStrategy;
import designPatterns.stratergyDesignPattern.Strategy.DrivingStrategy;
import designPatterns.stratergyDesignPattern.Strategy.FlyingStrategy;

public class Aeroplane extends Vehicle{

    Aeroplane(DrivingStrategy drivingStrategy, FlyingStrategy flyingStrategy, ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);

    }

}
