package Patterns.ChainOfResponsibility.Example_02;

public abstract class NewsPaperFilter {
    private int filterLevel;
    private NewsPaperFilter nextFilter;

    public NewsPaperFilter(int filterLevel){
        this.filterLevel = filterLevel;
    }

    public void sendNextFilter(NewsPaperFilter nextFilter){
        this.nextFilter = nextFilter;
    }

    public void sendNews(String news, int censorLevel){
        if (censorLevel >= filterLevel)
            censor(news);
        if (nextFilter != null)
            nextFilter.sendNews(news, censorLevel);
    }

    public abstract void censor(String news);
}
