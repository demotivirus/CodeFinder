package Logging.practice.MailService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    private Logger LOGGER;

    public Spy(Logger logger) {
        this.LOGGER = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailMessage.class){
            MailMessage msg = (MailMessage) mail;
            String from = mail.getFrom();
            String to = mail.getTo();
            if (from.equalsIgnoreCase("Austin Powers") || to.equalsIgnoreCase("Austin Powers"))
                LOGGER.warning("Detected target mail correspondence: from "
                        + from + " to " + to + " \"" + msg.getMessage() + "\"");
            else LOGGER.info("Usual correspondence: from " + from + " to " + to);
        }
        return mail;
    }
}
