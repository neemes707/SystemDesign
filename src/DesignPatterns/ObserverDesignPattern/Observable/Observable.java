package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.Observer;

public interface Observable<T> {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateData(T data);
    T getData();
    void notifyAllObservers();

}
