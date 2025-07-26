package DesignPatterns.FactorDesignPattern;

import DesignPatterns.FactorDesignPattern.factories.EvVehicleFactory;
import DesignPatterns.FactorDesignPattern.factories.NormalVehicleFactory;
import DesignPatterns.FactorDesignPattern.factories.VehicleFactory;
import DesignPatterns.FactorDesignPattern.model.Vehicle;

public class FactoryClient {
    public static void main(String[] args) {
        VehicleFactory normalVehicleFactory = new NormalVehicleFactory();
        VehicleFactory evVehicleFactory = new EvVehicleFactory();

        Vehicle evCar = evVehicleFactory.createVehicle(VehicleType.CAR.getType());
        System.out.println(evCar.getClass());

        Vehicle bike = normalVehicleFactory.createVehicle(VehicleType.Bike.getType());
        System.out.println(bike.getClass());
    }
}
