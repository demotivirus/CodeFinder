package OOP.theory.abstractClass.Example_01;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){
        name = "Animal";
        age = 1;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
