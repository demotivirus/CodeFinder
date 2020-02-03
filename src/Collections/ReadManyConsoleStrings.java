package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadManyConsoleStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        while (scn.hasNextLine()){
            String str = scn.nextLine();
            if (str.equals(""))
                break;
            arr.add(str);
        }

        System.out.println(arr.toString());
    }
}
