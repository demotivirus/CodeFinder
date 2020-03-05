package IO_NIO.Theory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/IO_NIO/Theory/path.txt");

        Path file = Files.createFile(path);

        //file = Files.createDirectory(path);


    }
}
