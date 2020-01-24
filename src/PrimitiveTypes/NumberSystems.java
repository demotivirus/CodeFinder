package PrimitiveTypes;

public class NumberSystems {
    public static void main(String[] args) {
        int binary1 = 0b0100_0100_1100; //1100
        int octal1 = 0_2114; //1100
        int decimal1 = 1100;
        int hexadecimal1 = 0x44C; //1100

        int binary2 = 0b0111_1110_0100; //2020
        int octal2 = 03744; //2020
        int decimal2 = 2020;
        int hexadecimal2 = 0x7E4; //2020

        int x = binary2 - decimal1; //920
        int y = hexadecimal1 + octal1; //2200
        int z = hexadecimal2 + hexadecimal1; //3120

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
