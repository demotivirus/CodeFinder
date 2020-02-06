package Logging.practice.MailService;

public class RealMailService implements MailService{

    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
