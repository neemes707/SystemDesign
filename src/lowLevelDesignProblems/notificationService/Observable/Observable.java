package lowLevelDesignProblems.notificationService.Observable;

import lowLevelDesignProblems.notificationService.Model.Notification;
import lowLevelDesignProblems.notificationService.Observers.NotificationObserver;

public interface Observable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers();
    void setData(Notification data);
    Notification getData();
}
