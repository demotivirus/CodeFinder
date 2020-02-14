package IO_NIO.Theory;

import java.io.*;
import java.nio.charset.Charset;

public class Example_03 {
    public static void main(String[] args) throws IOException {
        System.out.println("5.3 Потоки символов – Шаг 12");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String str = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(str);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String str;
        Reader reader = new InputStreamReader(inputStream, charset);
        Writer writer = new StringWriter();
        int res;
        while ((res = reader.read()) != -1){
            writer.write(res);
        }
        str = writer.toString();
        return str;
    }
}
