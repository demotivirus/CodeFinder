package IO_NIO.Theory;

import java.io.File;
import java.io.IOException;

public class ClassFile_03 {
    public static void main(String[] args) throws IOException {
        File file = new File("D://TestDir/&&&.txt");
        boolean create = file.createNewFile();
    }
}
