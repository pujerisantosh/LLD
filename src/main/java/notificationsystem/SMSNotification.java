package notificationsystem;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification(String message) {
        System.out.println("send SMS :" + message);
    }
}
