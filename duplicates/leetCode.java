import java.util.ArrayList;
import java.util.Arrays;

public class leetCode {

    public static void fun1(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                newArr.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] != i+1){
            newArr.add(i+1);
            break;
            }
        }
        System.out.println(newArr);
        
    }
}
