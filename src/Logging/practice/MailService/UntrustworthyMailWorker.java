package Logging.practice.MailService;

public class UntrustworthyMailWorker implements MailService{
    private RealMailService realMailService;
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices){
        this.mailServices = mailServices;
        for (MailService ms : this.mailServices) {
            if (ms instanceof RealMailService)
                this.realMailService = (RealMailService)ms;
        }
        if (this.realMailService == null) {
            this.realMailService = new RealMailService();
        }
    }

    public MailService getRealMailService(){
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable sendable = mail;
        for (MailService service : mailServices)
            sendable = service.processMail(sendable);
        return sendable;
    }
}
