package IO_NIO.Theory.Clone.ConstructorClone;

public class Car {
    private String mark;

    public Car(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                '}';
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}
