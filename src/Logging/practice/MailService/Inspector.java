package Logging.practice.MailService;

public class Inspector implements MailService{

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pckg = ((MailPackage) mail).getContent();
            String str = pckg.getContent();
            if (str.contains("stones"))
                throw new StolenPackageException();
            else if (str.contains("banned substance") || str.contains("weapons"))
                throw new IllegalPackageException();
        }
        return mail;
    }
}
