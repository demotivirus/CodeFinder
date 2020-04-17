package Strings;

import java.util.Arrays;
import java.util.List;

public class Split {
    public static void main(String[] args) {
        String names = "Tror Gvigris Deriana Nori";
        String[] s = names.split(" ");
        System.out.println(Arrays.toString(s));
        System.out.println(split(names));



    }

    private static int split(String names){
        int count = 0;
        String[] arr = names.split(" ");

        for (String st : arr){
            if (st.length() == 4)
                count++;
        }

        return count;
    }
}
