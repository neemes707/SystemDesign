package designPatterns.factorDesignPattern;

import designPatterns.factorDesignPattern.factories.EvVehicleFactory;
import designPatterns.factorDesignPattern.factories.NormalVehicleFactory;
import designPatterns.factorDesignPattern.factories.VehicleFactory;
import designPatterns.factorDesignPattern.model.Vehicle;

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
