package lowLevelDesignProblems.notificationService.Observable;

import lowLevelDesignProblems.notificationService.Model.Notification;
import lowLevelDesignProblems.notificationService.Observers.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements Observable{
    private List<NotificationObserver> observerList;
    private Notification notification;
    public NotificationObservable(Notification notification){
        this.notification = notification;
        this.observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setData(Notification data) {
        this.notification = data;
        notifyObservers();
    }

    @Override
    public Notification getData() {
        return this.notification;
    }

    public String getNotificationContent(){
        return this.notification.getContent();
    }
}
