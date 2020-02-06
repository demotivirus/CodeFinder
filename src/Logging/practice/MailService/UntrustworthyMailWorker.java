package Logging.practice.MailService;

public class UntrustworthyMailWorker implements MailService{
    private MailService[] mailServices;
    private MailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }

    public MailService getRealMailService() {
        return realMailService;
    }
}
