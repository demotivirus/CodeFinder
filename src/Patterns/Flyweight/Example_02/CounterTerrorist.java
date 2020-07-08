package Patterns.Flyweight.Example_02;

public class CounterTerrorist implements Player{
    private String task = "DIFFUSE THE BOMB";
    private String weapon;

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter terrorist with weapon " + weapon + " have mission " + task);
    }
}
