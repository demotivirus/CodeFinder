package Patterns.ChainOfResponsibility.Example_02;

public class PoliticsFilter extends NewsPaperFilter{

    public PoliticsFilter(int filterLevel) {
        super(filterLevel);
    }

    @Override
    public void censor(String news) {
        System.out.println("Invite to police station and threaten with violence for: " + news);
    }
}
