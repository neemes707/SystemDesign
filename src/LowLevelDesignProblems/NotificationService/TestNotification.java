package LowLevelDesignProblems.NotificationService;

import LowLevelDesignProblems.NotificationService.Decorators.SignatureDecorator;
import LowLevelDesignProblems.NotificationService.Decorators.TimestampDecorator;
import LowLevelDesignProblems.NotificationService.Model.Notification;
import LowLevelDesignProblems.NotificationService.Model.SimpleNotification;
import LowLevelDesignProblems.NotificationService.Observable.NotificationObservable;
import LowLevelDesignProblems.NotificationService.Observable.Observable;
import LowLevelDesignProblems.NotificationService.Observers.Console;
import LowLevelDesignProblems.NotificationService.Observers.NotificationObserver;
import LowLevelDesignProblems.NotificationService.Observers.NotificationSendingObserver;
import LowLevelDesignProblems.NotificationService.strategy.EmailStrategy;
import LowLevelDesignProblems.NotificationService.strategy.SendingNotificationStrategy;
import LowLevelDesignProblems.NotificationService.strategy.SmsStrategy;

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
