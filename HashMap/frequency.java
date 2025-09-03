// package HashMap;

import java.util.HashMap;
import java.util.*;

public class frequency {
    
    public static void main(String[] args) {
        int arr[] = {2,2,4,5,6,8,5,5,5,5,5,5,4,4,4,4,2,2,2,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            { 
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0;
        int ansKey = -1;

        // for(var ele : map.entrySet())
        // {
        //     if(ele.getValue() > maxFreq)
        //     {
        //         maxFreq = ele.getValue();
        //         ansKey = ele.getKey();
        //     }
        // }
        // System.out.println(ansKey);

        for(Integer key : map.keySet())
        {
            if(map.get(key) > maxFreq)
            {
                maxFreq = map.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey);
        // int maxFreq = 0;
        // for(Integer num : map.values())
        // {
        //     if(num > maxFreq)
        //     {
        //         maxFreq = num;
        //     }
        // }
        // System.out.println(maxFreq);
    }
}


// for(Integer key : map.keySet())
        // {
        //     if(map.get(key) > arr.length / 4)
        //     {
        //         System.out.println(key);
        //     }

        //     if(map.get(key) > 5)
        //     {
        //         System.out.println(key);
        //     }
        // }

        // for(Integer key : map.keySet())
        // {
        //     System.out.print(key + " ");
        // }
        // System.out.println();

        // System.out.println(map.keySet());