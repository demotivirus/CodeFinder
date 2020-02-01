package Cycles;

public class BrakeVsContinue {
    public static void main(String[] args) {
        System.out.println("==========Continue==========");
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                continue;
            }
            else if(i == 9){
                //System.out.println(100);
                continue;
            }
        }

        System.out.println("=========Break==========");
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            if (i == 9)
                break;
        }
    }
}
