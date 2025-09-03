import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class checkEquals {

    public static void chckEq(int arr[])
    {

        HashMap <Integer, Integer> map = new HashMap<>();
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

    //     int count = 0;
    //     for(int value : map.values())  
    //     {
    //         if(value > 1)
    //         {
    //             count++;
    //         }
    //     }

    //    System.out.println(count);

    //    for(Integer key : map.keySet())
    //    {
    //         if(map.get(key) > 1)
    //         {
    //             System.out.println("Value: " + key + ", count: " + map.get(key));
    //         }

    //     }

        ArrayList<Integer> newArr = new ArrayList<>();
        int ans = -1;
       for(Integer key : map.keySet())
       {
            if(map.get(key) == 1)
            {
                // newArr.add(key);
                ans = key;
            }

        }

        // System.out.println(newArr);
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        
        int arr[] = {2,2,4,5,6,8,5,5,5,5,5,5,4,4,4,4,2,2,2,3,3,45};
        chckEq(arr);
        
    }
}
