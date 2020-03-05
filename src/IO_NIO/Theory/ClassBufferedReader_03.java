package IO_NIO.Theory;

import java.io.*;
import java.nio.Buffer;

public class ClassBufferedReader_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/IO_NIO/Theory/buffered.txt"));

        String str;

        while ((str = reader.readLine()) != null)
            System.out.println(str);
    }
}
