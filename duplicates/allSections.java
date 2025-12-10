import java.util.ArrayList;
import java.util.HashSet;

public class allSections {
    
    public static void distinct(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(arr[i] + " ");
            }
            
        }
        System.out.println();
    }

    public static void repeating(int arr[]){
        int n = arr.length;
        // int count = 0;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        int ans = -1;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                // System.out.print(arr[i] + " ");
                // return arr[i];
                // ans = arr[i];
                newArr.add(arr[i]);

                // set.add(arr[i]);
                // newArr.add(arr[i]);
                // count = count + 1;
                // ans = arr[i];
                // break;
            }
            // System.out.println(ans);
        }
        // System.out.println();
        // System.out.println(set);
        // System.out.println(set.size());
        System.out.println(newArr);
    }

    public static void nonRepeat(int arr[]){
        int n = arr.length;
        ArrayList<Integer> newArr = new ArrayList<>();
        // int count = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count = count + 1;
                }
            }
            if(count == 1){
                newArr.add(arr[i]);
                System.out.print(arr[i] + " ");

            }
        }
         System.out.println();
        //  System.out.println(newArr.size());
    }
    public static void main(String[] args) {
        // int arr[] = {1,1,2,2,1,5,6,2,21,22,25,21,22};
        // int arr[] = {2,1,2,5,3,2};
         int arr[] = {2,5,1,4,7,5,82,4};
        // nonRepeat(arr);
        distinct(arr);
        repeating(arr);
        
    }
}
