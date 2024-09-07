package StrategyDesignPattern.WithDp;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sport drive strategy");
    }
}
