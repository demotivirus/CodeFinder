package OOP.theory.This;

public class ThisTip3 {
    private int length;
    private String message;

    public ThisTip3(String message){
        this(0, message);
    }


    public ThisTip3(int length, String message) {
        this.message = message;
        this.length = length;
    }
}
