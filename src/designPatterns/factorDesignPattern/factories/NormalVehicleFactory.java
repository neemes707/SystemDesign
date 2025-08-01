package designPatterns.factorDesignPattern.factories;

import designPatterns.factorDesignPattern.model.Bike;
import designPatterns.factorDesignPattern.model.Car;
import designPatterns.factorDesignPattern.model.NullVehicle;
import designPatterns.factorDesignPattern.model.Vehicle;

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
