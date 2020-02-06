package Logging.practice.MailService;

public class Thief implements MailService{
    private int minCostPackage;

    public Thief(int minCostPackage) {
        this.minCostPackage = minCostPackage;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }

    public int getStolenValue(){
        int count = 0;
        return count += minCostPackage;
    }
}
