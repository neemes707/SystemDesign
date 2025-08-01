package designPatterns.observerDesignPattern.Observable;

import designPatterns.observerDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WhetherStationObservable implements Observable<Integer>{
    private int currentTemperature;
    private List<Observer> observerList;
    public WhetherStationObservable(){
        this.observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void updateData(Integer data) {
        currentTemperature = data;
        notifyAllObservers();
    }

    @Override
    public Integer getData() {
        return this.currentTemperature;
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : observerList){
            observer.update();
        }
    }

}
