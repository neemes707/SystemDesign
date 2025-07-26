package FactorDesignPattern.factories;

import FactorDesignPattern.model.EvBike;
import FactorDesignPattern.model.EvCar;
import FactorDesignPattern.model.NullVehicle;
import FactorDesignPattern.model.Vehicle;

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
