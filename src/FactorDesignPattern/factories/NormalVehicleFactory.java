package FactorDesignPattern.factories;

import FactorDesignPattern.model.Bike;
import FactorDesignPattern.model.Car;
import FactorDesignPattern.model.NullVehicle;
import FactorDesignPattern.model.Vehicle;

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
