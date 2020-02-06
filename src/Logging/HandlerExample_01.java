package Logging;

import java.util.logging.*;

public class HandlerExample_01 {
    private static final Logger LOGGER = Logger.getLogger(HandlerExample_01.class.getName());

    public static void main(String[] args) {
        Handler consoleHandler = null;
        Handler fileHandler = null;

        try{
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("/javaCode.log");

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.config("Config done");

            LOGGER.removeHandler(consoleHandler);
            LOGGER.log(Level.FINE, "Finer logged");
        } catch (Exception ex){
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", ex);
        }

        LOGGER.finer("Finest example on LOGGER handler completed.");
    }
}
