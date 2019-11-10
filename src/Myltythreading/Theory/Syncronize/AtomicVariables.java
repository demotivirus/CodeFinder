package Myltythreading.Theory.Syncronize;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20_000; i++) {
            new MyThread().start();
        }
        Thread.sleep(2000);
        MyThread.printI();
        MyThread.getAtomicInteger();
    }

    static class MyThread extends Thread{

        private static int i;
        private static AtomicInteger atomicInteger = new AtomicInteger(0);

        public void run(){
            //atomic volatile not correct
            i++;

            //class for synch increment
            atomicInteger.incrementAndGet();
        }

        public static void printI() {
            System.out.println(i);
        }

        public static void getAtomicInteger() {
            System.out.println(atomicInteger.get());
        }
    }
}
