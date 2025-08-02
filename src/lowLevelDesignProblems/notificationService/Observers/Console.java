package lowLevelDesignProblems.notificationService.Observers;

import lowLevelDesignProblems.notificationService.Observable.Observable;

public class Console implements NotificationObserver{
    private Observable observable;
    public Console(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Printing in console :" + observable.getData().getContent());
    }
}
