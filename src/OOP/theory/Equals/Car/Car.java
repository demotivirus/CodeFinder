package OOP.theory.Equals.Car;

import java.util.Objects;

public class Car {
    private String mark;
    private int maxSpeed;

    public Car(String mark, int maxSpeed) {
        this.mark = mark;
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, maxSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (mark != car.mark) return false;
        if (maxSpeed != car.maxSpeed) return false;
        return true;
    }
}
