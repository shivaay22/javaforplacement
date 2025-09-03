import java.util.HashMap;

public class frequencyCheck
{
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

        // for(Integer key : map.keySet())
        // {
        //     if(map.get(key) > arr.length / 4)
        //     {
        //         System.out.println(key);
        //     }
        // }

        int ans = -1;
        for(Integer num : map.keySet()){
            if(map.get(num) == 1){
                ans = num;
            }
        }
        System.out.println(ans);
    }
}