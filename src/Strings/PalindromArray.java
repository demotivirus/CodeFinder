package Strings;

public class PalindromArray {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet".toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] arr = str.toCharArray();
        char[] revArr = new char[arr.length];
        int x = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[x] = arr[i];
            x++;
            //System.out.print(arr[i]);
        }

        String str2 = String.valueOf(revArr);
        System.out.println(str2);
        System.out.println(str.equals(str2));
    }
}
