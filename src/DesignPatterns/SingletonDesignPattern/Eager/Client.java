package DesignPatterns.SingletonDesignPattern.Eager;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.getInstance();
        System.out.println(vehicle.hashCode());

        Vehicle vehicle1 = Vehicle.getInstance();
        System.out.println(vehicle1.hashCode());

        //hash- code is same so object created only once
    }
}
