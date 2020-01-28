package PrimitiveTypes;

public class FinalTip {
    public int STANDARD_CONST = 10;

    final int TIP_CONST; //Not be a static

    FinalTip(){
        TIP_CONST = 20;
    }

    FinalTip(int you_const){
        TIP_CONST = you_const;
    }

    public static void main(String[] args) {
        System.out.println(new FinalTip().STANDARD_CONST);
        System.out.println(new FinalTip().TIP_CONST);
        System.out.println(new FinalTip(50).TIP_CONST);
    }
}
