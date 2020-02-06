package PrimitiveTypes;

import java.math.BigInteger;

public class ConvertNumberSystems {
    public static void main(String[] args) {
        long number = 29922;
        String substring = Long.toHexString(number);
        long res = Long.parseLong("292", 16);
        substring = Long.toOctalString(398892);
        substring = Long.toBinaryString(2233);
        substring = Long.toHexString(2992);
        System.out.println(substring);

        int num1 = 8884;
        String strBinary = Integer.toBinaryString(num1);
        String strOctal = Integer.toOctalString(num1);
        String strHex = Integer.toHexString(num1);

        int intBinary = 0b10001010110100;
        int intOctal = 021264;
        int intHex = 0x22B4;

        System.out.println(Integer.toBinaryString(num1));
        System.out.println(strOctal);
        System.out.println(strHex);
        System.out.println(intBinary);
        System.out.println(intOctal);
        System.out.println(intHex);

        BigInteger bigBinary = new BigInteger("18");
        System.out.println(bigBinary.toString(2));
        BigInteger bigOctal = new BigInteger("999");
        System.out.println(bigOctal.toString(4));
        System.out.println(new BigInteger("3993").toString(16));
    }
}
