package IO_NIO.Theory.Serialize.Example;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable{
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
}