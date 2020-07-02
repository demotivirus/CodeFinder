package Patterns.Brige.Example_04;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender send email message");
    }
}
