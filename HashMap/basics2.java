import java.util.HashMap;

public class basics2{

    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
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

        // for(int num : map.keySet()){
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        System.out.println(map.entrySet());
    }

}