package Arrays.Theory;

public class OddArray {
    public static void main(String[] args) {
        int[] arr = {-3,5,20,8,7,3,100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                sb = sb.append(Math.abs(arr[i]) + ",");
            }
        }

        //trim
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}

