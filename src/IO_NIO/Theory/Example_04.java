package IO_NIO.Theory;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x;
        double res = 0.0;
        while (scn.hasNext()){
            if (scn.hasNextDouble()) {
                x = scn.nextDouble();
                res += x;
            }
            else scn.next();
        }
        System.out.printf("%.6f", res);
    }
}
