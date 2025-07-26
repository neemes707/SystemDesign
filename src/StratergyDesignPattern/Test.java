package StratergyDesignPattern;

import StratergyDesignPattern.Strategy.impl.*;

public class Test {
    public static void main(String[] args) {
        /*TODO - according to strategy design pattern if we have same code
        *  in child classes which is different from the parent implementation
        *  so we need to remove that piece of code from inheritance and use
        *  composition or in simple words we can say, we must not write
        *   inheritance logic on the basic of and feature we extend rather
        *  we should write abstraction for those features and should write
        *  different concrete implementation for those abstractions and then
        *   we should use compositions to handle different properties */

        Vehicle car = new Car(new NormalDriveStrategy(),new NoFlyingStrategy(),new NoChargeStrategy());
        car.driveVehicle();

        Vehicle plane = new Aeroplane(new NormalDriveStrategy(), new NormalFlyingStrategy(),new NormalChargingStrategy());
        plane.flyVehicle();

        Vehicle evCar = new EvCar(new OffRoadDriveStrategy(),new NoFlyingStrategy(),new NormalChargingStrategy());
        evCar.chargeVehicle();


    }
}
