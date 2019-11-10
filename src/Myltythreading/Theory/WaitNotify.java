package Myltythreading.Theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WaitNotify {
    private static List<String> strings = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {
        ComputerUser user = new ComputerUser();
        ComputerMonitor monitor = new ComputerMonitor();

        Thread th = new Thread(user);
        Thread th2 = new Thread(monitor);

        th.start();
        th2.start();
    }

    static class ComputerUser implements Runnable{
        @Override
        public void run() {
            typeOnKeyBoard();
        }

        private void typeOnKeyBoard(){
            try(Scanner scn = new Scanner(System.in)){
                while(true){
                    System.out.print("User print: ");

                    synchronized (strings){
                        strings.add(scn.nextLine());
                        strings.notify();
                    }

                    //Sleep because threads "hungry"
                    Thread.sleep(300);
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    static class ComputerMonitor implements Runnable{

        @Override
        public void run() {
            printOnMonitor();
        }

        private void printOnMonitor(){
            while(strings.isEmpty()){
                synchronized (strings){
                    try{
                        strings.wait();
                    } catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                System.out.print("Monitor input: ");
                System.out.println(strings.remove(0));
                System.out.println();
            }
        }
    }
}
