package Logging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample_01 {
    private static final Logger LOGGER = Logger.getLogger(LoggerExample_01.class.getName());

    public static void main(String[] args) throws SecurityException, IOException, InterruptedException {
        LOGGER.info("Logger name " + LOGGER.getName());

        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");

        int[] arr = {1,2,3};
        try{
            Thread.sleep(3000);
            System.out.println(arr[4]);
            Thread.sleep(3000);
        } catch (ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, "Exception occur");
        }
    }
}
