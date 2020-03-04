package IO_NIO.Theory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ClassByteArray_04 {
    public static void main(String[] args) throws IOException {
        byte[] res = "JAVA IS...".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(res);

        int count;
        do {
            count = byteArrayInputStream.read();
            System.out.print(count + " ");
            //if (count == 3)
                byteArrayInputStream.close();
        } while (count != -1);
    }
}
