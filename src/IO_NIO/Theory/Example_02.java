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
        int read;
        while ((read = inputStream.read()) != -1) {
            //read = inputStream.read();
            //byte res = (byte) read;
            if((res = (byte) read) % 2 == 0){
                outputStream.write(res);
            }
        }
    }
}
