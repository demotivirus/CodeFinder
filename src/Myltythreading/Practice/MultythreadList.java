package Myltythreading.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultythreadList {
    public static void main(String[] args) {

        try{
            System.out.println("THREAD POOL STARTING...");
            long start = System.currentTimeMillis();
            ExecutorService threadPool = Executors.newFixedThreadPool(4);
            List<Future<Double>> futureList = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                int x = i;
                futureList.add(CompletableFuture.supplyAsync(() -> count(x), threadPool));
            }

            double temp = 0.0;

            for(Future<Double> future : futureList){
                temp += future.get();
                //System.out.println(temp);
            }
            long end = System.currentTimeMillis();
            System.out.println("END IN " + (end - start) + " ms");
            threadPool.shutdown();
        } catch(InterruptedException ex){
            ex.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static Double count(double a){
        for (int i = 0; i < 400_000; i++) {
            a += Math.tan(a);
        }
        return a;
    }
}
