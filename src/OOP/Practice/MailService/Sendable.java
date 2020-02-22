package OOP.Practice.MailService;

public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}
