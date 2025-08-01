package designPatterns.observerDesignPattern.Observable;

import designPatterns.observerDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

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
            /**using multi threading to avoid bottleneck of performance at sending notifications
             * can we heavy process , we can also use some Messaging Queues like Kafka or Rabbit MQ*/
           CompletableFuture.runAsync(observer::update);
        }
    }
}
