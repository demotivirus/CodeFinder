package IO_NIO.Theory.Serialize;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
    }

    private static Animal[] deserializeAnimalArray(byte[] data) {
        int count = 0;
        Animal[] animals = new Animal[0];

        ByteArrayInputStream dataInputStream = new ByteArrayInputStream(data);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(dataInputStream);

            count = objectInputStream.readInt();
            animals = new Animal[count];

            for (int i = 0; i < count; i++) {
                Animal a = (Animal) objectInputStream.readObject();
                animals[i] = a;
            }

        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
        return animals;
    }
}
