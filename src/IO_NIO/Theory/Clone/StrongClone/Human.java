package IO_NIO.Theory.Clone.StrongClone;

public class Human implements Cloneable{
    private String name;
    private byte age;
    private Car car;

    @Override
    protected Human clone() throws CloneNotSupportedException {
        Human human = (Human) super.clone();
        human.car = car.clone();
        return human;
    }

    public Human(String name, byte age, String carModel) {
        this.name = name;
        this.age = age;
        this.car = new Car(carModel);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setCar(String carMark) {
        car.setMark(carMark);
    }
}
