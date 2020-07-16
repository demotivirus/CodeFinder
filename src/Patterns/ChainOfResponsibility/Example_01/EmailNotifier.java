package Patterns.ChainOfResponsibility.Example_01;

public class EmailNotifier extends Notifier{

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email notify: " + message);
    }
}
