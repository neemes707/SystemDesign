package StrategyDesignPattern.WithDp;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive Strategy");
    }
}
