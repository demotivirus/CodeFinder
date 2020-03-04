package IO_NIO.Theory.Externalizable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("D://externalizable.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        User user = new User("Steve Jhobs", "kingOfIPhones");

        outputStream.writeObject(user);
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D://externalizable.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        User userCopy = (User) inputStream.readObject();
        fileInputStream.close();
        fileOutputStream.close();
        inputStream.close();

        System.out.println(user);
        System.out.println(userCopy);
    }
}
