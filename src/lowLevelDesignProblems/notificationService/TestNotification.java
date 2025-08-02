package lowLevelDesignProblems.notificationService;

import lowLevelDesignProblems.notificationService.Decorators.SignatureDecorator;
import lowLevelDesignProblems.notificationService.Decorators.TimestampDecorator;
import lowLevelDesignProblems.notificationService.Model.Notification;
import lowLevelDesignProblems.notificationService.Model.SimpleNotification;
import lowLevelDesignProblems.notificationService.Observable.NotificationObservable;
import lowLevelDesignProblems.notificationService.Observable.Observable;
import lowLevelDesignProblems.notificationService.Observers.Console;
import lowLevelDesignProblems.notificationService.Observers.NotificationObserver;
import lowLevelDesignProblems.notificationService.Observers.NotificationSendingObserver;
import lowLevelDesignProblems.notificationService.strategy.EmailStrategy;
import lowLevelDesignProblems.notificationService.strategy.SendingNotificationStrategy;
import lowLevelDesignProblems.notificationService.strategy.SmsStrategy;

import java.util.ArrayList;
import java.util.List;

public class TestNotification {
    public static void main(String[] args) {

        Notification notification =  new SignatureDecorator(
                new TimestampDecorator(
                        new SimpleNotification("You order has been delivered"))
                ,"-by logistic team");

        System.out.println(notification.getContent());
        Observable observable = new NotificationObservable(notification);

        List<SendingNotificationStrategy> strategyList = new ArrayList<>();
        strategyList.add(new EmailStrategy("abcdef@example.com"));
        strategyList.add(new SmsStrategy("1234567890"));

        NotificationObserver notificationObserver = new NotificationSendingObserver(observable,strategyList);
        NotificationObserver consoleObserver = new Console(observable);

        observable.addObserver(notificationObserver);
        observable.addObserver(consoleObserver);

        observable.setData(notification);

    }


}
