package Exceptions.theory;

public class Example_11 {
    public static void main(String[] args) {
        try{
            System.out.println("Hello " + getEx());
            System.out.println("How are you?");
        } catch (RuntimeException ex){
            System.err.println("error suppressed");
        }

        System.out.println("Meow /ᐠ≗ᆽ≗ᐟ\\");
        getEx();
    }

    private static Exception getEx(){
        throw new RuntimeException();
    }
}
