package LowLevelDesignProblems.NotificationService.strategy;

public class EmailStrategy implements SendingNotificationStrategy{
    private String email;
    public EmailStrategy(String email){
        this.email = email;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email to email " + email);
        System.out.println(message);
    }
}
