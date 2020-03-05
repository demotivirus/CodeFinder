package IO_NIO.Theory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ClassByteArray_05 {
    public static void main(String[] args) throws IOException {
        byte[] arr = "Java is path".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        byteArrayInputStream.read(arr);
    }
}
