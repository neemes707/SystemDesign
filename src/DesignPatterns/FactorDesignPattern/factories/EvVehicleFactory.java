package DesignPatterns.FactorDesignPattern.factories;

import DesignPatterns.FactorDesignPattern.model.EvBike;
import DesignPatterns.FactorDesignPattern.model.EvCar;
import DesignPatterns.FactorDesignPattern.model.NullVehicle;
import DesignPatterns.FactorDesignPattern.model.Vehicle;

public class EvVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String type) {
        if(type.equalsIgnoreCase("Bike")){
            return new EvBike();
        }else if(type.equalsIgnoreCase("car")){
            return new EvCar();
        }else{
            return new NullVehicle();
        }
    }
}
