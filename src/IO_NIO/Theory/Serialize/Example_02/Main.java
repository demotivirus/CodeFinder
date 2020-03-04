package IO_NIO.Theory.Serialize.Example_02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Garfield", 8, "Ginger");

        //Serialize
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(cat);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));

        //CLONE
        Cat cloneCat = (Cat) inputStream.readObject();

        System.out.println(cat);
        System.out.println(cloneCat);

        cloneCat.setColor("Black");

        System.out.println(cat);
        System.out.println(cloneCat);

        byteArrayOutputStream.close();
        inputStream.close();
    }
}
