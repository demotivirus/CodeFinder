package IO_NIO.Theory;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassByteArray_03 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] res = "Hello world".getBytes();
        byteArrayOutputStream.write(res);

        try (FileOutputStream fileOutputStream = new FileOutputStream("D://test.txt")){
            byteArrayOutputStream.write(res);
            byteArrayOutputStream.flush();
        }
    }
}
