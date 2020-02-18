package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeCollections {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        for (Integer i : set1){
            System.out.println(i);
        }

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        for (Integer i : set2){
            System.out.println(i);
        }


        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>(set1);
        Set<T> result2 = new HashSet<>(set2);
        result.removeAll(set2);
        result2.removeAll(set1);

        result.addAll(result2); //swap!
        return result;
    }
}
