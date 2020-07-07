package Patterns.Decorator.Example_02;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report";
    }

    @Override
    public String writeCode(){
        return super.writeCode() + " & " + sendWeekReport();
    }
}
