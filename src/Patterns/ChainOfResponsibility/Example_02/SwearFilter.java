package Patterns.ChainOfResponsibility.Example_02;

public class SwearFilter extends NewsPaperFilter{

    public SwearFilter(int filterLevel) {
        super(filterLevel);
    }

    @Override
    public void censor(String news) {
        System.out.println("Send fine 5000$ for swear: " + news);
    }
}
