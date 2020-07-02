package Patterns.Brige.Example_04;

public class EmailMessage extends Message{

    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
