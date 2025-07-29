package LowLevelDesignProblems.NotificationService.Decorators;

import LowLevelDesignProblems.NotificationService.Model.Notification;

import java.security.Signature;

public class SignatureDecorator implements NotificationDecorator{
    private String signature;
    private Notification notification;
    public SignatureDecorator(Notification notification, String signature){
        this.notification = notification;
        this.signature = signature;
    }
    @Override
    public String getContent() {
        return notification.getContent() + "\n" + signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
