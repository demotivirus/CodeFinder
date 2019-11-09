package IO_NIO.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCopyFiles {
    public static void main(String[] args) throws IOException{

        try(FileInputStream fileInputStream = new FileInputStream("D:\\input.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\output.txt")){

            int tmp;

            //Copy symbols
            while((tmp = fileInputStream.read()) != -1){
                char count = (char) tmp;
                fileOutputStream.write(count);
            }

            System.out.println("Copy success");
        } catch (IOException ex){
                ex.printStackTrace();
        }
    }
}
