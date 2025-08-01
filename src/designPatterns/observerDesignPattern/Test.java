package designPatterns.observerDesignPattern;

import designPatterns.observerDesignPattern.Observable.CricketScoreObservable;
import designPatterns.observerDesignPattern.Observable.Observable;
import designPatterns.observerDesignPattern.Observable.WhetherStationObservable;
import designPatterns.observerDesignPattern.Observer.Observer;
import designPatterns.observerDesignPattern.Observer.PhoneDisplayObserver;
import designPatterns.observerDesignPattern.Observer.TabletDisplayObserver;

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
