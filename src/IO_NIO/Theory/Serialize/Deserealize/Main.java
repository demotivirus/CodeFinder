package IO_NIO.Theory.Serialize.Deserealize;

import java.io.*;
import IO_NIO.Theory.Serialize.Example_03.Cat;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D://saved.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        //CLONE
        Cat cloneCat = (Cat) inputStream.readObject();

        System.out.println(cloneCat);
    }
}
