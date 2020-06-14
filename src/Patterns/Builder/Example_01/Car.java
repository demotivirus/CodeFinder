package Patterns.Builder.Example_01;

public class Car {
    private Type type;
    private int numOfSeats;
    private int maxSpeed;

    public Car(Type type, int numOfSeats, int maxSpeed) {
        this.type = type;
        this.numOfSeats = numOfSeats;
        this.maxSpeed = maxSpeed;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
