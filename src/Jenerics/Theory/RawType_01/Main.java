package Jenerics.Theory.RawType_01;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Gen gen = new Gen();
        gen.m(integerList);
    }
}
