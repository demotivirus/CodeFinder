package PrimitiveTypes;

public class StringToNumber {
    public static void main(String[] args) {
        int x = 18;
        String str = String.valueOf(x);
        str = Integer.toString(x);

        int z = Integer.parseInt(str);
        z = Integer.valueOf(str);
    }
}
