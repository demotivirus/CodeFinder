package Collections;

import java.util.*;

public class SortCollection {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List list = new ArrayList();
//        int count = 0;
//        Integer res;
//        while (scanner.hasNextInt()){
//            res = scanner.nextInt();
//            if (count % 2 != 0) {
//                list.add(res);
//            }
//            count++;
//        }
//
//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.print(list.get(i) + (i != 0 ? " " : ""));
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int count = 0;
        int res;
        while (scanner.hasNextInt()){
            res = scanner.nextInt();

            if (count % 2 != 0)
                deque.addFirst(res);
            count++;
        }

        for (Integer i : deque) {
            System.out.println(deque.pop());
        }
    }
}
