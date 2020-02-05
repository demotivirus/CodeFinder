package PrimitiveTypes;

public class ConvertNumberSystems {
    public static void main(String[] args) {
        long number = 29922;
        String substring = Long.toHexString(number);
        long res = Long.parseLong("292", 16);
        substring = Long.toOctalString(398892);
        substring = Long.toHexString(2992);
        substring = Long.toBinaryString(2233);
        System.out.println(substring);
    }
}
