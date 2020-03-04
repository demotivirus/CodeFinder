package IO_NIO.Theory.Serialize.Example_03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Garfield", 8, "Ginger");

        //Serialize
        FileOutputStream fileOutputStream = new FileOutputStream("D://saved.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(cat);
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D://saved.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        //CLONE
        Cat cloneCat = (Cat) inputStream.readObject();

        System.out.println(cat);
        System.out.println(cloneCat);

        cloneCat.setColor("Black");

        System.out.println(cat);
        System.out.println(cloneCat);

        fileOutputStream.close();
        fileInputStream.close();
        inputStream.close();
    }
}
