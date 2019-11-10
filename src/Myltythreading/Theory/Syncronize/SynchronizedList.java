package Myltythreading.Theory.Syncronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("Jonathan");

        class MyThread extends Thread{
            public void run(){
                System.out.println(nameList.removeFirst());
            }
        }

        MyThread myThread = new MyThread();
        myThread.start();
        new MyThread().start();
    }

    static class NameList{
        private List list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name){
            list.add(name);
        }

        //Synch weak methods on program!
        //Not synch: IndexOutOfBoundsException
        public synchronized String removeFirst(){
            if (list.size() > 0)
                return (String) list.remove(0);
            return null;
        }
    }
}
