package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.Observable.CricketScoreObservable;
import DesignPatterns.ObserverDesignPattern.Observable.Observable;
import DesignPatterns.ObserverDesignPattern.Observable.WhetherStationObservable;
import DesignPatterns.ObserverDesignPattern.Observer.Observer;
import DesignPatterns.ObserverDesignPattern.Observer.PhoneDisplayObserver;
import DesignPatterns.ObserverDesignPattern.Observer.TabletDisplayObserver;

public class Test {
    public static void main(String[] args) {
        Observable<Integer> observable = new WhetherStationObservable();
        Observable<String> cricketScore = new CricketScoreObservable();

        Observer observer1 = new PhoneDisplayObserver(observable);
        Observer observer2 = new TabletDisplayObserver(observable);

        Observer cricketScoreDisplay = new PhoneDisplayObserver(cricketScore);
        cricketScore.addObserver(cricketScoreDisplay);
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.updateData(32);
        observable.removeObserver(observer1);
        observable.updateData(31);

        cricketScore.updateData("150/1");

    }
}
