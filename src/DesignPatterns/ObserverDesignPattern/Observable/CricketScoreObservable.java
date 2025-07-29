package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreObservable implements Observable<String>{
    private String score;
    private List<Observer> observerList;
    public CricketScoreObservable(){
        this.score = "";
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
    public void updateData(String data) {
        this.score = data;
        notifyAllObservers();
    }

    @Override
    public String getData() {
        return this.score;
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : observerList){
            observer.update();
        }
    }
}
