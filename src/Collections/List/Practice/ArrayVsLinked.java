package Collections.List.Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked {
    private static long start, end;
    private static int count = 0;
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        start(arrayList, "add");
        start(linkedList, "add");

        start(arrayList, "get");
        start(linkedList, "get");

        start(arrayList, "add", 0);
        start(linkedList, "add", 0);

        start(arrayList, "add", 50);
        start(linkedList, "add", 50);

        start(arrayList, "add", 50000);
        start(linkedList, "add", 50000);

        start(arrayList, "remove");
        start(linkedList, "remove");
    }

    public static <T> void start(List<Integer> list, String meth){
        getTimeStart();
        fori(100_000, list, meth);
        getTimeEnd();
        getTime();
        count++;
        if (count % 2 == 0)
            System.out.println("======================");
    }

    public static <T> void start(List<Integer> list, String meth, int index){
        getTimeStart();
        fori(100_000, list, meth, index);
        getTimeEnd();
        getTime();
        count++;
        if (count % 2 == 0)
            System.out.println("======================");
    }

//    public static <T> void getTimeAdd(List<Integer> list){
//        getTimeStart();
//        fori(1_000_000, list, "add");
//        getTimeEnd();
//        getTime();
//    }

    private static long getTimeStart(){
        return start = System.currentTimeMillis();
    }

    private static long getTimeEnd(){
        end = System.currentTimeMillis();
        return end;
    }

    private static void getTime(){
        long time = end - start;
        System.out.println(time);
    }

    private static void fori(int iterators, List<Integer> list, String meth){
        for (int i = 0; i < iterators; i++) {
            if (meth.equals("add"))
                list.add(i);
            else if (meth.equals("get"))
                list.get(i);
            else if (meth.equals("remove"))
                list.remove(i);
        }
    }

    private static void fori(int iterators, List<Integer> list, String meth, int index){
        for (int i = 0; i < iterators; i++) {
            if (meth.equals("add"))
                list.add(index, i);
        }
    }
}
