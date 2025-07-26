package DesignPatterns.FactorDesignPattern.factories;

import DesignPatterns.FactorDesignPattern.model.Bike;
import DesignPatterns.FactorDesignPattern.model.Car;
import DesignPatterns.FactorDesignPattern.model.NullVehicle;
import DesignPatterns.FactorDesignPattern.model.Vehicle;

public class NormalVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String type) {
        if(type.equalsIgnoreCase("car")){
            return new Car(4,"White");
        }else if(type.equalsIgnoreCase("bike")){
            return new Bike(2,"Black");
        }else{
            return new NullVehicle();
        }
    }
}
