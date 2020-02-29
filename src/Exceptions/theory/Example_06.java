package Exceptions.theory;

import java.io.CharConversionException;
import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public class Example_06 {
    public static void main(String[] args) {
        try {
            //Many exceptions here
            //} catch (IOException | CharConversionException ex) NOT WORK
            throw new SQLException();
            //throw  new RuntimeException();
        } catch (SQLException ex){
            ex.printStackTrace();

            throw new RuntimeException();
        } catch (RuntimeException ex){
            ex.printStackTrace();
        }
    }
}
