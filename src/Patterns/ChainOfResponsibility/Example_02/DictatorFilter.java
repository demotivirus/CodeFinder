package Patterns.ChainOfResponsibility.Example_02;

public class DictatorFilter extends NewsPaperFilter{

    public DictatorFilter(int filterLevel) {
        super(filterLevel);
    }

    @Override
    public void censor(String news) {
        System.out.println("Throw to prison for: " + news);
    }
}
