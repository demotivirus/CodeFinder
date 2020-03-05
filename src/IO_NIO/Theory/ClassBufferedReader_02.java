package IO_NIO.Theory;

import java.io.*;

public class ClassBufferedReader_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/IO_NIO/Theory/buffered.txt", true));

        String str;
        while (!(str = reader.readLine()).equals("esc")){
            writer.write(str);
        }

        reader.close();
        writer.close();
    }
}
