package designPatterns.observerDesignPattern.Observer;

import designPatterns.observerDesignPattern.Observable.Observable;

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
