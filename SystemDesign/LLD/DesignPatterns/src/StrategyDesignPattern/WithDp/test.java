package StrategyDesignPattern.WithDp;

public class test {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new PassengerVehicle();
        vehicle1.drive();
    }
}
