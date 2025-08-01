package designPatterns.singletonDesignPattern.LazyInitialization;

public class Car {
    static Car instance;
    private Car(){

    }

    //double check locking and lazy initialization
    public static Car getInstance(){
        if(instance == null) {
            synchronized (Car.class){
            if (instance == null) {
                instance = new Car();
            }
            }
        }
        return instance;
    }
}
