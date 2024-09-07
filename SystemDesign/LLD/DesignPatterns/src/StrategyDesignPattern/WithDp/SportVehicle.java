package StrategyDesignPattern.WithDp;

public class SportVehicle extends Vehicle{
     SportVehicle() {
        super(new SportDriveStrategy());
    }
}
