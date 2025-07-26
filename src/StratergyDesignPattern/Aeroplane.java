package StratergyDesignPattern;

import StratergyDesignPattern.Strategy.ChargingStrategy;
import StratergyDesignPattern.Strategy.DrivingStrategy;
import StratergyDesignPattern.Strategy.FlyingStrategy;

public class Aeroplane extends Vehicle{

    Aeroplane(DrivingStrategy drivingStrategy, FlyingStrategy flyingStrategy, ChargingStrategy chargingStrategy){
        super(drivingStrategy,flyingStrategy,chargingStrategy);

    }

}
