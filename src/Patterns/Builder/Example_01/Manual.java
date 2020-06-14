package Patterns.Builder.Example_01;

public class Manual {
    private Type type;
    private int numOfSeats;
    private int maxSpeed;

    public Manual(Type type, int numOfSeats, int maxSpeed) {
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

    @Override
    public String toString() {
        return "Manual{" +
                "type=" + type +
                ", numOfSeats=" + numOfSeats +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
