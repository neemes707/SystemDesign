package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.Observable;


public class TabletDisplayObserver implements Observer {
    private Observable<?> observable;
    public TabletDisplayObserver(Observable<?> observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Tablet Display : Data changed to " + observable.getData());
    }
}
