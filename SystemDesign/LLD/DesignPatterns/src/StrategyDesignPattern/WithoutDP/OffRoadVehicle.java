package StrategyDesignPattern.WithoutDP;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Sporty drive functionality");
    }
    /* Here the OffRoad vehicle uses its own drive functionality which is same as
    * Sport Vehicle and this functionality is not present in base class  */
}
