package Patterns.ChainOfResponsibility.Example_01;

public class SMSNotifier extends Notifier{

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending sms notify: " + message);
    }
}
