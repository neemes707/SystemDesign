package designPatterns.factorDesignPattern;

public enum VehicleType {
    CAR("Car"),
    Bike("Bike");
    final String type;
    VehicleType(String type){
        this.type = type;
    }
    String getType(){
        return this.type;
    }
}
