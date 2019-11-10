package IO_NIO.Practice;

import java.io.*;
import java.util.Scanner;

public class ReadFileToConsole {
    public static void main(String[] args) {
        String fileName = "\\input.txt";

//        methodOne(fileName);
//        methodTwo(fileName);
        methodThree(fileName);
    }

    public static void methodOne(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String resultat = sb.toString();
            System.out.println(resultat);
            System.out.println("==============END===============");
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void methodTwo(String fileName){
        File file = new File(fileName);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String str;

            while((str = br.readLine()) != null)
                System.out.println(str);
            System.out.println("==============END===============");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void methodThree(String fileName){
        File file = new File(fileName);

        try(Scanner scn = new Scanner(file)) {
            while (scn.hasNextLine())
                System.out.println(scn.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
