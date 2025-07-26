package DesignPatterns.StratergyDesignPattern;

import DesignPatterns.StratergyDesignPattern.Strategy.ChargingStrategy;
import DesignPatterns.StratergyDesignPattern.Strategy.DrivingStrategy;
import DesignPatterns.StratergyDesignPattern.Strategy.FlyingStrategy;

public class Aeroplane extends Vehicle{

    Aeroplane(DrivingStrategy drivingStrategy, FlyingStrategy flyingStrategy, ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);

    }

}
