package notificationService;

public class InitialUserNotificationService {
    private InitialNotifier notifier;

    public InitialUserNotificationService(InitialNotifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.send(message);
    }

    public void setNotifier(InitialNotifier notifier){
        this.notifier = notifier;
        notifier.misc();
    }


    public static void main(String[] args){
        InitialUserNotificationService iuns = new InitialUserNotificationService(new InitialEmailNotifier());
        iuns.notifyUser("ALERT: Severe weather warning");
    }

}
