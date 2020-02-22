package Collections.Map.Theory.Magazine;

import java.io.*;
import java.util.*;

public class Magazine {
    //static Map<String, Long> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000" +
                "\nАнтон 8000\nАлексей 3000\nАлексей 3000").getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        getSalesMap(buffReader);
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner scn = new Scanner(reader);
        String str;
        long num;
        while(scn.hasNext()){
            map.merge(scn.next(), scn.nextLong(), (prev, one) -> one + prev);
        }

//        for (Map.Entry<String, Long> item : map.entrySet()){
//            System.out.println(item.getKey() + " " + item.getValue());
//        }

        map.forEach((k, v) -> System.out.println(k + " " + v));
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        return map;
    }
}
