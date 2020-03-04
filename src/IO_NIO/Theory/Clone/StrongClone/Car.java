package IO_NIO.Theory.Clone.StrongClone;

public class Car implements Cloneable{
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

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
