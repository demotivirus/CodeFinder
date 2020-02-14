package IO_NIO.Theory;

import java.io.*;

public class Example_02 {
    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[] {2, -11, 7, 51, 64});
        OutputStream outputStream = new ByteArrayOutputStream();
        print(stream, outputStream);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte res;
        int read = 0;
        while (read != -1) {
            read = inputStream.read();
            res = (byte) read;
            if(res % 2 == 0){
                outputStream.write(res);
            }
        }
    }
}
