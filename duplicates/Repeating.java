import java.util.ArrayList;
import java.util.HashSet;

public class Repeating{

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

        ArrayList<Integer> newArr = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            
            if(flag){
                // newArr.add(arr[i]);
                hs.add(arr[i]);
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {1,1,2,2,1,5,6,2,21,22,25,21,22};
        // distinct(arr);
        // nonRepeat(arr);
    }
}