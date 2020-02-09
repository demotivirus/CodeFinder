package Logging.practice.MailService;

public class Thief implements MailService{
    private int minCostPackage;
    private int stolenCount = 0;

    public Thief(int minCostPackage) {
        this.minCostPackage = minCostPackage;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage){
            Package pckg = ((MailPackage)mail).getContent();
            if (pckg.getPrice() >= minCostPackage){
                stolenCount += pckg.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pckg.getContent(), 0));
            }
        }
        return mail;
    }

    public int getStolenValue(){
        return stolenCount;
    }
}
