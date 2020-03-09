package Collections.Set.Theory;

import java.util.*;

public class ClassTreeSet {
    public static void main(String[] args) {
        Random random = new Random(50);
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            treeSet.add(random.nextInt());
            System.out.println(treeSet.iterator().next());
        }

        System.out.println(Arrays.asList(treeSet));
    }
}
