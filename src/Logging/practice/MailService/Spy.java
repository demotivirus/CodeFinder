package Logging.practice.MailService;

import java.util.logging.Logger;

public class Spy implements MailService{
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
