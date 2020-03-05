package IO_NIO.Theory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPath {
    public static void main(String[] args) {
        Path path = Paths.get("src/IO_NIO/Theory/path.txt");
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
    }
}
