package designPatterns.observerDesignPattern.Observer;

import designPatterns.observerDesignPattern.Observable.Observable;


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
