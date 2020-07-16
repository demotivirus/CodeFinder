package Patterns.ChainOfResponsibility.Example_02;

public class Main {
    public static void main(String[] args) {
        NewsPaperFilter orderNewsPaper = new OrderNewsPaper(Censor.NON);
        NewsPaperFilter swear = new SwearFilter(Censor.SWEAR);
        NewsPaperFilter politics = new PoliticsFilter(Censor.POLITICS);
        NewsPaperFilter dictator = new DictatorFilter(Censor.DICTATOR);
        NewsPaperFilter tyrant = new TyrantFilter(Censor.TYRANT);

        //CHAIN OF RESPONSIBILITY
        orderNewsPaper.sendNextFilter(swear);
        swear.sendNextFilter(politics);
        politics.sendNextFilter(dictator);
        dictator.sendNextFilter(tyrant);

        orderNewsPaper.sendNews("Our life is so beautiful", Censor.NON);
        tab();
        orderNewsPaper.sendNews("Our government is reptilian!", Censor.TYRANT);
        tab();
        orderNewsPaper.sendNews("Politic Franc if pig", Censor.SWEAR);
        tab();
        orderNewsPaper.sendNews("I think that Earth is flat...", Censor.DICTATOR);
    }

    public static void tab(){
        System.out.println("==========================");
    }
}
