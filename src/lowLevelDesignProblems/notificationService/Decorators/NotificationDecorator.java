package lowLevelDesignProblems.notificationService.Decorators;

import lowLevelDesignProblems.notificationService.Model.Notification;

public interface NotificationDecorator extends Notification{
    String getContent();
}
