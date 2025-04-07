import java.util.*;
import java.util.ArrayList;

public class arrayListData {
   
    public static void checkKey(int arr[],int i,int size,int key,ArrayList<Integer> list)
    {
        if(i == size)
        {
            return;
        }
        if(arr[i] == key)
        {
            list.add(i);
        }

        checkKey(arr, i+1, size, key, list);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,7,8,3};
        int size = arr.length;
        int key = 3;
        int i = 0;
    
        ArrayList<Integer> keyEle = new ArrayList<>();
        checkKey(arr, 0, size, key, keyEle);
        // for(int j=0;j<keyEle.size();j++)
        // {
        //     System.out.print(j + " ");
        // }
        System.out.println(keyEle.size());
        // System.out.println();

    }
}
