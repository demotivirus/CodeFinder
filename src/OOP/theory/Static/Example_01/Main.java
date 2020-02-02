package OOP.theory.Static.Example_01;

public class Main {
    public static class Cat{
        public void sayHello(){
            System.out.println("Мяу!");
        }
    }

    public static class Dog{
        public void sayHello(){
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat){
            cat = new Cat();
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
