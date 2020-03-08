package Collections.List.Practice.MoscowBuildings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/Collections/List/Practice/MoscowBuildings/moscow-buildings.csv");
        int length = fileInputStream.available();
        byte[] buf = new byte[length];
        fileInputStream.read(buf);

        String str = new String(buf);
        //System.out.println(str);

        String[] spl = str.split("\n");

        List<String []> list = new ArrayList<>();
        for (String s : spl){
            //System.out.println(s + "\n");
            String[] words = s.split(",");
            list.add(words);
        }

        for (String[] words : list){
            if (words[9].equals("1815")) {
                for (String s : words) {
                    System.out.print(s);
                    System.out.print("|");
                }
                System.out.println();
                System.out.println("=====================================");
            }
        }

        Map<String, Integer> hashmap = new TreeMap<>();
        for (String[] words : list){
            if (hashmap.containsKey(words[9])){
                Integer k = hashmap.get(words[9]);
                k += 1;
                hashmap.put(words[9], k);
            }
            else hashmap.put(words[9], 1);
        }
        String year = "1980";
        System.out.println("In " + year + " build " + hashmap.get(year));
        System.out.println("=====================================");

        for (String key : hashmap.keySet()){
            System.out.println("Year " + key + " build " + hashmap.get(key));
        }
    }
}
