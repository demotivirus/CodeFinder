package Collections.Set.Theory;

import java.util.*;

public class ClassTreeSet {
    public static void main(String[] args) {
        Random random = new Random(50);
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < treeSet.size(); i++) {
            treeSet.add(i);
        }
    }
}
