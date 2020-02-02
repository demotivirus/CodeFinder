package Arrays.Theory;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] left = {2, 7, 9};
        int[] right = {18, 2, 4};
        System.out.println(Arrays.toString(mergeArrays5(left, right)));
    }

    public static int[] mergeArrays5(int[] a1, int[] a2){
        bubbleSort(a1);
        bubbleSort(a2);
        int[] res = new int[a1.length + a2.length];
        int left = 0;
        int right = 0;

        for (int i = 0; i < res.length; i++) {

            //if left length is over
            //record right
            if (left > a1.length - 1){
                res[i] = a2[right];
                right++;
            }

            //if right length is over
            //record left
            else if (right > a2.length - 1){
                res[i] = a1[left];
                left++;
            }

            //if left < right
            //record left
            else if(a1[left] < a2[right]){
                res[i] = a1[left];
                left++;
            }

            //else record right
            else {
                res[i] = a2[right];
                right++;
            }
        }
        return res;
    }

    public static int[] mergeArrays4(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;

        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }

    public static int[] mergeArrays3(int[] left, int[] right) {
        int[] result = new int [left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex + rightIndex < result.length) {
            if(rightIndex==right.length || leftIndex != left.length
                    && left[leftIndex] < right[rightIndex]) {
                result[leftIndex + rightIndex] = left[leftIndex++];
            } else {
                result[leftIndex + rightIndex] = right[rightIndex++];
            }
        }
        return result;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        bubbleSort(a1);
        bubbleSort(a2);
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length - 1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }

    public static int[] mergeArrays2(int[] a1, int[] a2) {
        //if length = 10
        int[] result = new int[a1.length + a2.length];
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < result.length; i++) {
            //if 0 >= 5
            //res[i] = a2[i]
            //second++
            if (firstIndex >= a1.length) {
                result[i] = a2[secondIndex];
                secondIndex += 1;
            } else if (secondIndex >= a2.length) {
                result[i] = a1[firstIndex];
                firstIndex += 1;
            } else if (a1[firstIndex] < a2[secondIndex]) {
                result[i] = a1[firstIndex];
                firstIndex += 1;
            } else {
                result[i] = a2[secondIndex];
                secondIndex += 1;
            }
        }
        return result;
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
