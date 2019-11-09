package IO_NIO.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByfferCopyFiles {
    public static void main(String[] args) {

        String originFile = "D:\\input.txt";
        String copyFile = "D:\\output.txt";

        try(FileInputStream fileInputStream = new FileInputStream(originFile);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile)){

            byte[] buffer = new byte[16384];
            int size = 0;
            long start = System.currentTimeMillis();

            while((size = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, size);
                System.out.println("loading...");
            }

            long end = System.currentTimeMillis();
            System.out.println("Copy success " + (end - start) + " ms");
        } catch(IOException ex){
                ex.printStackTrace();
        }
    }
}
