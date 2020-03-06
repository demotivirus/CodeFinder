package Jenerics.Theory.Example_06;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 8, 15, 22, 64};
        System.out.println(inArray(8, arr));
        printIfInArray(16, arr);
        printIfInArray(22, arr);

        //printIfInArray("22", arr);
    }

    //Only numbers
    private static <T extends Comparable<T>, V extends T> boolean inArray(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if (x == y[i]) return true;
        }
        return false;
    }

    private static <T extends Number, V extends T> void printIfInArray(T x, V[] y){
        boolean flag = false;
        for (int i = 0; i < y.length; i++) {
            if (x == y[i]) {
                flag = true;
                System.out.println(y[i] + " is this array");
            }

            else if (i == y.length - 1 & !flag){
                System.out.println(x + " not in this array");
            }
        }
    }
}
