package Patterns.Builder.Example_05;

public class App {
    public static void main(String[] args) {
        Human mike = new Human.Builder()
                .name("Mike")
                .address("Novosibirsk")
                .build();

        System.out.println(mike);
    }
}
