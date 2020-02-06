package Logging;

import java.util.logging.Logger;

public class Example_01 {
    public static void main(String[] args) {
        logging();
    }

    public static void logging() {
        Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");

        LOGGER.info("Все хорошо");
        LOGGER.warning("Произошла ошибка");
    }
}
