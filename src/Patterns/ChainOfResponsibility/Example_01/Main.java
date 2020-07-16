package Patterns.ChainOfResponsibility.Example_01;

public class Main {
    public static void main(String[] args) {
        Notifier simpleReport = new SimpleReportNotifier(Priority.ALL);
        Notifier email = new EmailNotifier(Priority.ERROR);
        Notifier sms = new SMSNotifier(Priority.FATAL);

        //CHAIN OF RESPONSIBILITY
        simpleReport.setNextNotifier(email);
        email.setNextNotifier(sms);

        simpleReport.manager("Everything is OK ", Priority.ALL);
        System.out.println("=============================");
        simpleReport.manager("Something error", Priority.ERROR);
        System.out.println("=============================");
        simpleReport.manager("System crash and burn out O_o", Priority.FATAL );
        System.out.println("=============================");
    }
}
