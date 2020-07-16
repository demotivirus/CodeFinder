package Patterns.ChainOfResponsibility.Example_01;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority){
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Notify use the simple notifier: " + message);
    }
}
