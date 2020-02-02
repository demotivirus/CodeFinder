package OOP.theory;

public class Human {
    private byte age;
    private String name;
    private String secondName;
    private String favoriteSport;

    public Human(){}

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}

class CreateHuman{
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte) 30, "Andrey", "Ling", "JavaMentor");
        Human human3 = new Human((byte) 40, "Jhon", "Ueek");
    }
}
