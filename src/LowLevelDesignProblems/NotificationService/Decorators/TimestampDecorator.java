package LowLevelDesignProblems.NotificationService.Decorators;

import LowLevelDesignProblems.NotificationService.Model.Notification;

import java.time.LocalDateTime;

public class TimestampDecorator implements NotificationDecorator{
    private Notification notification;
    public TimestampDecorator(Notification notification){
        this.notification = notification;
    }

    @Override
    public String getContent() {
        return LocalDateTime.now().toString() + " " + notification.getContent();
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
