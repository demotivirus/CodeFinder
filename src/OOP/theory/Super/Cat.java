package OOP.theory.Super;

public class Cat extends Animal{
    private int weight;
    private String name;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, int weight){
        super(name, age);
        this.weight = weight;
    }

    public String getName(){
        return super.getName();
    }

    public String getMyName(){
        return "Cat name";
    }
}
