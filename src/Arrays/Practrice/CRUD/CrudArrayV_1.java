package Arrays.Practrice.CRUD;

/*
 * Create
 * Read
 * Update
 * Delete
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class CrudArrayV_1 {
    private int[] arr;

    //Create
    CrudArrayV_1(int size){
        this.arr = new int[size];
    }

    //Read
    public int get(int pos){
        return arr[pos];
    }

    //Update
    public int add(int pos, int num){
        return arr[pos] = num;
    }

    //Delete
    public int delete(int pos){
        return arr[pos] = 0;
    }

    //Get all
    public String getAll(){
       return Arrays.toString(arr);
    }

    //Find number
    public String find(int number){
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                res = number + " find on " + i + " position";
                return res;
            }
        }
        if(res.equals(""))
            return res = number + " not find!";

        return res;
    }
}
