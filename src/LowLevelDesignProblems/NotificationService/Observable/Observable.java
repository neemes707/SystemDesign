package LowLevelDesignProblems.NotificationService.Observable;

import LowLevelDesignProblems.NotificationService.Model.Notification;
import LowLevelDesignProblems.NotificationService.Observers.NotificationObserver;

public interface Observable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers();
    void setData(Notification data);
    Notification getData();
}
