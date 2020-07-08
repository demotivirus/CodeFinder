package Patterns.Factory.Example_04;

public class Terrorist implements Player {
    private String task = "PLANT THE BOMB";
    private String weapon;

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " have mission " + task);
    }
}
