package IO_NIO.Theory;

import java.io.File;

public class ClassFile_02 {
    public static void main(String[] args) {
        File file = new File("D://TestDir//NewDir");
        boolean created = file.mkdir(); //create package
        if(created)
            System.out.println("Folder is created");
        File renameDir = new File("D://TestDir//RenameDir");
        file.renameTo(renameDir);

        boolean dlt = renameDir.delete();
        if (dlt)
            System.out.println("RenameDir deleted");
    }
}
