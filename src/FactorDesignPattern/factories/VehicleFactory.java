package FactorDesignPattern.factories;

import FactorDesignPattern.model.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String type);
}
