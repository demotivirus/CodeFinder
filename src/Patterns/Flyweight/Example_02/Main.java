package Patterns.Flyweight.Example_02;

import java.util.Random;

public class Main {
    private static String[] players = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 1_000; i++) {
            Player player = PlayerFactory.getPlayer(getRPlayer());
            player.setWeapon(getRWeapon());
            player.mission();
        }
    }

    private static String getRPlayer(){
        Random random = new Random();
        int rand = random.nextInt(players.length);
        return players[rand];
    }

    private static String getRWeapon(){
        Random random = new Random();
        int rand = random.nextInt(weapons.length);
        return weapons[rand];
    }
}
