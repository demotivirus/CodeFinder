package OOP;

public class ReturnInVoid {
    public static void main(String[] args) {
        sum(-8, 6);
    }

    public static void sum(int a, int b){
        if(a < 0 || b < 0){
            return;
        }
        System.out.println(a + b);
    }
}
