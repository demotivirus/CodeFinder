package Generics.Theory.DinamicArray;

import java.util.Arrays;

public class DynamicArray<T> {
    //private T el;
    private Object[] arr;
    private int min_capacity = 10;
    private int size;

    public DynamicArray() {
        this.arr = new Object[min_capacity];
    }

    public void add(T el) {
        if (size < min_capacity)
            arr[size++] = el;
        else{
            min_capacity *= 2;
            arr = Arrays.copyOf(arr, min_capacity);
            arr[size++] = el;
        }
    }

    public void remove(int index) {
        int numMoved = size - index - 1;
        if (min_capacity > 0)
            System.arraycopy(arr, index+1, arr, index,
                    numMoved);
        arr[--size] = null;
    }

    public int size() {
        return size;
    }

    public int length(){
        return arr.length;
    }

    public T get(int index) {
        return (T) arr[index];
    }
}
