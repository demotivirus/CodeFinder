package Patterns.Flyweight.Example_02;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static Map<String, Player> players = new HashMap<>();

    public static Player getPlayer(String str) {
        Player player = players.get(str);

        if (player == null) {
            switch (str) {
                case "Terrorist":
                    System.out.println("Terrorist created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter terrorist created");
                    player = new CounterTerrorist();
                    break;
            }
            players.put(str, player);
        }

        return player;
    }
}
