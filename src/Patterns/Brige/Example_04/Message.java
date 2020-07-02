package Patterns.Brige.Example_04;

public abstract class Message {
    protected MessageSender messageSender;

    public Message(){}

    public Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public abstract void send();
}
