package OOP.theory.Interface.Example_02;

public interface Moveable {
    public static final int speed = 10;

    public static void move(){
        System.out.println("Move");
    }

    public default void run(){
        System.out.println("Run");
    }

    public abstract void jump();
}
