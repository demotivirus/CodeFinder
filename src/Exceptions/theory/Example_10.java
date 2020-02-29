package Exceptions.theory;

import java.io.IOException;

public class Example_10 {
    public static void main(String[] args) throws Exception{
        try{
            throw new IOException("Try ex");
        } catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            throw new Exception("Finally ex");
        }
    }
}
