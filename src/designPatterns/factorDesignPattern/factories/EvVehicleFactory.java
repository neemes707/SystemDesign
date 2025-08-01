package designPatterns.factorDesignPattern.factories;

import designPatterns.factorDesignPattern.model.EvBike;
import designPatterns.factorDesignPattern.model.EvCar;
import designPatterns.factorDesignPattern.model.NullVehicle;
import designPatterns.factorDesignPattern.model.Vehicle;

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
