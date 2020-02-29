package Exceptions.theory;

public class Example_12 {
    public static void main(String[] args) throws InterruptedException {
        try{
            System.out.println("HI");
        } finally {
            return;
        }

        //Unreachable statement
        //Thread.sleep(5000);
    }
}
