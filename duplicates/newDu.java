import java.util.ArrayList;
import java.util.HashMap;

public class newDu{

    public static void fun1(int arr[]){
        int n = arr.length;
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }

    public static void fun2(int arr[]){
        int n = arr.length;
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }

    public static void fun3(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        // for(int ele : map.keySet()){
        //     if(map.get(ele) == 1){
        //         System.out.print(ele + " ");
        //     }
        // }
        // System.out.println();

        int max = -1;
        int ans = -1;
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            if(freq > max){
                max = freq;
                ans = ele;
            }
        }
        System.out.println(ans);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,4,7,5,82,5};
        // fun1(arr);
        // fun2(arr);
        fun3(arr);
    }
}