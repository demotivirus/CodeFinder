package Exceptions.theory.outOfMemoryError;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    private static final ExecutorService executor = Executors.newFixedThreadPool(5);
    private static MemoryGrabber grabber = new MemoryGrabber();
    public static void main(String[] args) throws Exception{
        executor.submit(() -> {
           try{
               grabber.grabAllMemory();
           } catch (Throwable ex){
               ex.printStackTrace();
           }
        }).get();
    }
}
