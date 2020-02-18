package Collections;

import java.util.*;

public class AllUtilCollections {
    public static void main(String[] args) {

        //========SET=========
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Color> enumSet = EnumSet.allOf(Color.class);

        //========LIST=========
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        //List<Integer> stack = new SortCollection<>();
        List<Integer> vector = new Vector<>();

        //========QUEUE=========
        Queue<Integer> arrayQueue = new ArrayDeque<>();
        Queue<Integer> linkedList2 = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        //========Map=========
        Map<Color, Color> enumMap = new EnumMap<>(Color.class);
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> hasTable = new Hashtable<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> weekHashMap = new WeakHashMap<>();
    }
}

enum Color{
    RED, YELLOW, WHITE, BLUE;
}