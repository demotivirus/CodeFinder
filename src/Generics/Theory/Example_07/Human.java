package Generics.Theory.Example_07;

public class Human {
    private byte age;

    public <T extends Byte> Human(T age){
        this.age = age.byteValue();
    }

    @Override
    public String toString() {
        return "Human: " +
                "age = " + age;
    }
}
