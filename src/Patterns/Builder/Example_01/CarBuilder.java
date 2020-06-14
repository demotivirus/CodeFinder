package Patterns.Builder.Example_01;

public class CarBuilder implements Builder{
    private Type type;
    private int numOfSeats;
    private int maxSpeed;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setNumOfSeats(int seats) {
        this.numOfSeats = seats;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "type=" + type +
                ", numOfSeats=" + numOfSeats +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
