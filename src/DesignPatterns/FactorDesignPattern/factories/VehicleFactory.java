package DesignPatterns.FactorDesignPattern.factories;

import DesignPatterns.FactorDesignPattern.model.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String type);
}
