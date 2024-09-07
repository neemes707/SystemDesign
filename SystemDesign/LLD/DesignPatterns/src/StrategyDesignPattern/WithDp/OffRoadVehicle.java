package StrategyDesignPattern.WithDp;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
