package Patterns.Adapter.Example_03;

public class MovableKmhAdapter implements MovableKMH{
    private MovableMPH luxuryCar;

    public MovableKmhAdapter(MovableMPH luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    @Override
    public double getSpeed() {
        return convertMphToKmh(luxuryCar.getSpeed());
    }

    private double convertMphToKmh(double mph){
        return mph * 1.60934;
    }
}
