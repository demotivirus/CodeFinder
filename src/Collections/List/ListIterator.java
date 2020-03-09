package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//How work for-each - does work on vew modcount
public class ListIterator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sara", "Jack");
        names = new ArrayList(names);
        Iterator<String> iterator = names.iterator();
        names.add("modcount++");
        //System.out.println(iterator.next());
    }
}
