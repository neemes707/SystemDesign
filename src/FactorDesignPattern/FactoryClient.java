package FactorDesignPattern;

import FactorDesignPattern.factories.EvVehicleFactory;
import FactorDesignPattern.factories.NormalVehicleFactory;
import FactorDesignPattern.factories.VehicleFactory;
import FactorDesignPattern.model.Vehicle;

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
