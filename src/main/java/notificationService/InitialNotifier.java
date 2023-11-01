package notificationService;

public interface InitialNotifier {
    void send(String message);

    private void connect(){
        System.out.println("Connecting to some service...");
    }
    default void misc(){
        this.connect();
    }
}
