package Collections.Map.Practice.NumsPopularWordsInBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class SearchPopularWords{
    public void searchInFile(String file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        int length = fis.available();
        byte[] buf = new byte[length];
        fis.read(buf);

        String text = new String(buf).toLowerCase();

        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words = pattern.split(text);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                Integer count = map.get(words[i]);
                count += 1;
                map.put(words[i], count);
            } else map.put(words[i], 1);
        }

        //System.out.println("Word big contains in text " + treeMap.get("big") + " times");

//        for (int i = 1000; i >= 0; i--) {
//            if (getKey(treeMap, i) == null){
//                //don't nothing
//            }
//            else System.out.println(getKey(treeMap, i) + " contains " + i + " times");
//            //else System.out.println(getKey(treeMap, i));
//        }

        //map.forEach((k, v) ->System.out.println(k + " " + v));

        Set<String> collections = new TreeSet<>();

        for (Map.Entry<String, Integer> item : map.entrySet()){
            if (item.getValue() < 10 || item.getValue() > 600)
                continue;
            else{
                collections.add(item.getValue() + " " + item.getKey());
            }
        }

        for (String s : collections) {
            System.out.println(s);
        }
    }

//    public <K, V> K getKey(Map<K, V> map, V value) {
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            if (entry.getValue().equals(value)) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }
}
