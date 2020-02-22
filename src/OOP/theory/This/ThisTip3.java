package OOP.theory.This;

public class ThisTip3 {
    private int length;
    private String message;
    private String status;

    public ThisTip3(String message){
        this(0, message);
    }


    public ThisTip3(int length, String message) {
        this.message = message;
        this.length = length;
    }

    public ThisTip3(int length, String message, String status) {
        this(length, message);
        this.status = status;
    }

    public ThisTip3(){
        this(0, "Hello", "OK");
    }
}
