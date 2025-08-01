package designPatterns.singletonDesignPattern.Eager;
public class Vehicle {
    static Vehicle instance = new Vehicle();
    private Vehicle(){

    }
    static Vehicle getInstance(){
        return instance;
    }
}
