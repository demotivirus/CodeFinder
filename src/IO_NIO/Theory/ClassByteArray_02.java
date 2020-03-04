package IO_NIO.Theory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ClassByteArray_02 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        String str = "Java is top";
        byte[] res = str.getBytes();
        byteArrayOutputStream.write(res);

        for (byte b : res)
            System.out.print(b + " ");
        System.out.println();

        foreach(res);

        res = "New string line".getBytes();
        byteArrayOutputStream.write(res);

        foreach(res);
    }

    private static void foreach(byte[] bytes){
        for (byte b : bytes)
            System.out.print((char) b + " ");
        System.out.println();
    }
}
