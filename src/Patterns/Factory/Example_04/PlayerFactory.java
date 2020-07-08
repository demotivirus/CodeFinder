package Patterns.Factory.Example_04;

public class PlayerFactory {
    public static Player getPlayer(String player){
        switch(player){
            case "Terrorist":
                System.out.println("Terrorist created");
                return new Terrorist();
            case "CounterTerrorist":
                System.out.println("Counter terrorist created");
                return new CounterTerrorist();
            default: throw new IllegalArgumentException("Player not found " + PlayerFactory.class);
        }
    }
}
