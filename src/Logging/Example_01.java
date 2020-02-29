package Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example_01 {
    public static void main(String[] args) {
        logging();
    }

    public static void logging() {
        Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        Logger LOGG = Logger.getLogger(Example_01.class.getName());
        Logger LOG = Logger.getAnonymousLogger();

        LOGGER.info("Все хорошо");
        LOGGER.warning("Произошла ошибка");
        LOGG.warning("LOGG" + LOGG.getName());
        LOG.warning("Anon log");

        LOG.setLevel(Level.ALL);
    }
}
