package Arrays.Practrice;

import java.util.Arrays;

class DynamicArray<T extends Integer> {
    private T[] arr;
    //private Object[] arr;
    private int min_capacity = 10;
    private int size;

    public DynamicArray() {
        this.arr = (T[]) new Integer[min_capacity];
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

    public T get(int index) {
        return arr[index];
    }
}
