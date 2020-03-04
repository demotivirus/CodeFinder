package IO_NIO.Theory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("\\test.txt"))){
            String str;
            do{
                str = bufferedReader.readLine();
                bufferedReader.close();
                System.out.println(str);
            } while (str != null);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
