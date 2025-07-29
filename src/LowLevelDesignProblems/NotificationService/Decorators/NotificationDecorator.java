package LowLevelDesignProblems.NotificationService.Decorators;

import LowLevelDesignProblems.NotificationService.Model.Notification;

public interface NotificationDecorator extends Notification{
    String getContent();
}
