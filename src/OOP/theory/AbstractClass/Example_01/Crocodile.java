package OOP.theory.AbstractClass.Example_01;

public class Crocodile extends Animal{
    private int weight;

    public Crocodile(){}

    public Crocodile(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }
}
