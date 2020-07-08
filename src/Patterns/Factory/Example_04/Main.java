package Patterns.Factory.Example_04;

public class Main {
    public static void main(String[] args) {
        Player terrorist = PlayerFactory.getPlayer("Terrorist");
        terrorist.mission();
    }
}
