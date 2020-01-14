package OOP.theory.thiss;

public class Animal {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(){
        this("Animal", 0);
    }
}
