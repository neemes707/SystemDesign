package lowLevelDesignProblems.notificationService.strategy;

public class SmsStrategy implements SendingNotificationStrategy{
    private String mobileNumber;
    public SmsStrategy(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to mobile number " + mobileNumber );
        System.out.println(message);
    }
}
