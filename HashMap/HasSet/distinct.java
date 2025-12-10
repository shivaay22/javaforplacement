// package HasSet;

import java.util.HashSet;

public class distinct {
    
    public static void dis(int arr[]){
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


    public static void nonRepeat(int arr[]){
        int n = arr.length;
        // int count = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[] = {1,1,2,2,1,5,6,2,21,22,25,21};
        dis(arr);
    }
}
