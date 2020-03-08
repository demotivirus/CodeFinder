package Collections.Set.Practice.ShortStory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String path = "src/Collections/Set/Practice/ShortStory/shortStory.txt";
        try(FileInputStream fileInputStream = new FileInputStream(path)){
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);

            String string = new String(buffer);
            //System.out.println(string);

            String[] arr = string.toLowerCase().split("[ ,.\":;]+");
            Set<String> set = new TreeSet<>();

            for (String s : arr)
                set.add(s);

            System.out.println(Arrays.asList(set));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
