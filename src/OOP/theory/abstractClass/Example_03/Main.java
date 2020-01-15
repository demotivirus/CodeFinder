package OOP.theory.abstractClass.Example_03;

public class Main {
    public static void main(String[] args) {
        Animal snake = new Snake();

        //Exception
        //snake.doSomething();

        snake.doSomethingToo();

        Animal.doSomething();

        Animal animal = new Animal() {
            @Override
            public void doSomethingToo() {
                super.doSomethingToo();
            }
        };
        animal.doSomethingToo();
    }
}
