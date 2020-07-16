package Patterns.ChainOfResponsibility.Example_02;

public class TyrantFilter extends NewsPaperFilter{

    public TyrantFilter(int filterLevel) {
        super(filterLevel);
    }

    @Override
    public void censor(String news) {
        System.out.println("Brutally torture and expose for: " + news);
    }
}
