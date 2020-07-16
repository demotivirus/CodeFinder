package Patterns.ChainOfResponsibility.Example_02;

public class OrderNewsPaper extends NewsPaperFilter{

    public OrderNewsPaper(int filterLevel) {
        super(filterLevel);
    }

    @Override
    public void censor(String news) {
        System.out.println("Everything read this news: " + news);
    }
}
