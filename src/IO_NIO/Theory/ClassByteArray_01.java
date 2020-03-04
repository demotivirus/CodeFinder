package IO_NIO.Theory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ClassByteArray_01 {
    public static void main(String[] args) throws IOException {
        byte[] arr = {56, 66, 64, 32};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        printBytes(byteArrayInputStream);

        byte[] chars = {'J', 'a', 'v', 'a'};
        byteArrayInputStream = new ByteArrayInputStream(chars);

        System.out.println("==========================");

        printBytes(byteArrayInputStream);
    }

    private static void printBytes(ByteArrayInputStream byteArrayInputStream){
        int res;
        do{
            res = byteArrayInputStream.read();
            if (res != -1)
                System.out.println(res);
        } while (res != -1);
    }
}
