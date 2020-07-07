package Patterns.Decorator.Example_02;

public class Main {
    public static void main(String[] args) {
        Developer javaDev = new JavaDeveloper();
        System.out.println(javaDev.writeCode());

        Developer javaSenior = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(javaSenior.writeCode());

        Developer javaTeamLead = new JavaTeamLead(new JavaDeveloper());
        System.out.println(javaTeamLead.writeCode());
    }
}
