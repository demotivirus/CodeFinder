package Strings.Practice;

import java.util.Arrays;

public class ImmutableClass implements CharSequence{
    private final byte[] arr;

    public ImmutableClass(byte[] arr){
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] res = Arrays.copyOfRange(arr, start, end);
        return new ImmutableClass(res);
    }

    @Override
    public String toString() {
        return new String(arr);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        ImmutableClass sequence = new ImmutableClass(example);
        System.out.println(sequence.toString());
        System.out.println(sequence.length());
        System.out.println(sequence.charAt(4));
        System.out.println(sequence.subSequence(1, 4));
        example[0] = 74;
        System.out.println(sequence.toString());
    }
}
