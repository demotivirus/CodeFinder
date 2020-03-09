package Collections.Queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Example_01 {
    public static void main(String[] args) {
        Queue<Integer> arrayQueue = new ArrayDeque<>(50);

        for (int i = 0; i < 50; i++) {
            arrayQueue.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayQueue.poll());
        }

        System.out.println(Arrays.asList(arrayQueue));

    }
}
