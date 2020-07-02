package Patterns.Brige.Example_04;

public class TextMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender send text message");
    }
}
