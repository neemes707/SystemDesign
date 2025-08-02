package lowLevelDesignProblems.notificationService.Observers;

import lowLevelDesignProblems.notificationService.Observable.Observable;
import lowLevelDesignProblems.notificationService.strategy.SendingNotificationStrategy;

import java.util.List;

public class NotificationSendingObserver implements NotificationObserver{
    private Observable observable;
    private List<SendingNotificationStrategy> sendingNotificationStrategyList;
    public NotificationSendingObserver(Observable observable,List<SendingNotificationStrategy> sendingNotificationStrategyList){
        this.observable = observable;
        this.sendingNotificationStrategyList = sendingNotificationStrategyList;
    }
    @Override
    public void update() {
        for(SendingNotificationStrategy strategy : sendingNotificationStrategyList){
            strategy.sendNotification(observable.getData().getContent());
        }
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public List<SendingNotificationStrategy> getSendingNotificationStrategyList() {
        return sendingNotificationStrategyList;
    }

    public void setSendingNotificationStrategyList(List<SendingNotificationStrategy> sendingNotificationStrategyList) {
        this.sendingNotificationStrategyList = sendingNotificationStrategyList;
    }
}
