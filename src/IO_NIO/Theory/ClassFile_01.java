package IO_NIO.Theory;

import java.io.File;

public class ClassFile_01 {
    public static void main(String[] args) {
        File file = new File("D://TestDir");
        if (file.isDirectory()){
            for (File foreach : file.listFiles()){
                if (foreach.isDirectory())
                    System.out.println(foreach.getName() + "\t is directory");
                else
                    System.out.println(foreach.getName() + "\t is file");
            }
        }
    }
}
