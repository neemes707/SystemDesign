package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.Observable;

public class PhoneDisplayObserver implements Observer{
    private Observable<?> observable;
    public PhoneDisplayObserver(Observable<?> observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Phone Display : Data changed to " + observable.getData());
    }
}
