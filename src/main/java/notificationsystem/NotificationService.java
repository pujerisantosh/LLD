package notificationsystem;

public class NotificationService {
    public static void main(String[] args) {

        // Get Email Notification object from Factory
        Notification email = NotificationFactory.createNotification("email");
        email.sendNotification("Hello via Email!");

        // Get SMS Notification object from Factory
        Notification sms = NotificationFactory.createNotification("sms");
        sms.sendNotification("Hello via SMS!");

        // Get Push Notification object from Factory
        Notification push = NotificationFactory.createNotification("push");
        push.sendNotification("Hello via Push Notification!");


    }
}
