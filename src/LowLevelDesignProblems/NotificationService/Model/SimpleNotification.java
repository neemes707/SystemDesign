package LowLevelDesignProblems.NotificationService.Model;

public class SimpleNotification implements Notification{
    private String notificationMessage;
    public SimpleNotification(String notificationMessage){
        this.notificationMessage = notificationMessage;
    }

    @Override
    public String getContent() {
        return notificationMessage;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
