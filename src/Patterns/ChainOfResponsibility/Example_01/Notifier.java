package Patterns.ChainOfResponsibility.Example_01;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority){
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }

    public void manager(String message, int level){
        if (level >= priority)
            sendMessage(message);
        if (nextNotifier != null)
            nextNotifier.manager(message, level);
    }

    public abstract void sendMessage(String message);
}
