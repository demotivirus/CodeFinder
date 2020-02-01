package Cycles;

//char byte short int String enum
public class Switch {
    public static void main(String[] args) {
        String str = "osso";

        switch (str){
            default:
                System.out.println(str);
        }

        float flt = 7.8f;

        //Incompatible types. Found: 'float', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
//        switch (flt){
//
//        }
    }
}
