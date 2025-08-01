package designPatterns.factorDesignPattern.factories;

import designPatterns.factorDesignPattern.model.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String type);
}
