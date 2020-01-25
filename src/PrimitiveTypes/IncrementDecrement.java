package PrimitiveTypes;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        a = a-- - --a + ++a + a++ + a;
        //  5(4) - 3  +  4  + 4(5) + 5;
        // a = 2 + 8 + 5
        // a = 15;
        System.out.println(a);

        int b = 8;

        b = ++b - b++ + ++b - --b;
        //   9  - 9(10)+ 11  - 10;
        // a = 0 + 11 - 10;
        //a = 1;
        System.out.println(b);

        int c = 10;
        c = ++c - --c - --c + c++ - c-- + c + --c;
        //  11  - 10  -  9  + 9(10)-10(9)+9 + 8;
        //c = 1 - 9 + 9 - 10 + 9 + 8;
        //c = -9 + 17;
        //c = 8;
        System.out.println(c);

        int d = 4;
        d = d++ + d++ + d++;
        //  4(5)+ 5(6)+ 6;
        // d = 9 + 6;
        // d = 15;
        System.out.println(d);
    }
}
