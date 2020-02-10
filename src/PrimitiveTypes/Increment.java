package PrimitiveTypes;

public class Increment {
    public static void main(String[] args) {
        int x = 8;
        int y = 8 + x++ + 8 + ++x;
        //      8 + 8(9)+ 8 + 10
        System.out.println(y); //34
    }
}
