package Exceptions.theory;

public class Example_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(300);
                if (i == 5)
                    badMethod();
                goodMethod();
            } catch (NullPointerException | InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    private static void goodMethod(){
        System.out.println("OK.....");
    }

    private static void badMethod(){
        throw new NullPointerException();
    }
}
