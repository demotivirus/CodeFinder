package OOP.theory.InnerClasses;

import java.util.Date;
import java.util.Timer;

//Multi extends
//Multi main
public class StaticInner extends Date {
    static int age;

    public static void main(String[] args) {
        Inner.print();
    }

    static class Inner extends Timer{
        public static void main(String[] args) {
            age = 18;
            System.out.println(age);
        }

        public static void print() {
            System.out.println("...");
        }

        static class Inn{
            public static void main(String[] args) {
                System.out.println("O_o");
            }
        }
    }
}
