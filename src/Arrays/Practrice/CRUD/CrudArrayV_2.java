package Arrays.Practrice.CRUD;

import java.util.Arrays;

public class CrudArrayV_2 {
    private int[] arr;

    //Create
    CrudArrayV_2(int size){
        arr = new int[size];
    }

    //Read
    public int get(int pos){
        return arr[pos];
    }

    //Update
    private int pos = 0;
    public int add(int num){
        arr[pos] = num;
        pos++;
        return arr[pos];
    }

    //Delete
    public int delete(int pos){
        return arr[pos] = 0;
    }

    //Get all
    public String getAll(){
        return Arrays.toString(arr);
    }

    //Delete all
    public void deleteAll(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        pos = 0;
        System.out.println("Delete success");
    }
}
