package Myltythreading.Theory.CreateThreads;

public class Training_01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "Runnable");
        thread.start();
    }

    static class MyThread extends Thread{
        public void run(){
            System.out.println(Thread.currentThread().getName() + " start");
        }
    }

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " start");
        }
    }
}

