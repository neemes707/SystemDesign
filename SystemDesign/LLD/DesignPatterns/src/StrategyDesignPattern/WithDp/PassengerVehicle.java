package StrategyDesignPattern.WithDp;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
