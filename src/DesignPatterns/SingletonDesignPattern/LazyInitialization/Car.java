package DesignPatterns.SingletonDesignPattern.LazyInitialization;

public class Car {
    static Car instance;
    private Car(){

    }

    //thread safe double check locking and lazy initialization
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
