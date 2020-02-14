package IO_NIO.Theory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example_01 {
    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[] {1, -11, 7, 51});
        System.out.println(sumOfStream(stream));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        byte res;
        int read = 0;
        int sum = 1;
        while (read != -1) {
            read = inputStream.read();
            res = (byte) read;
            sum += res;
        }
        return sum;
    }
}
