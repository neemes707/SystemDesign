package designPatterns.observerDesignPattern.Observable;

import designPatterns.observerDesignPattern.Observer.Observer;

public interface Observable<T> {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateData(T data);
    T getData();
    void notifyAllObservers();

}
