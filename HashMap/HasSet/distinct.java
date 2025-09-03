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

    public static void dis2(int arr[]){
        int n = arr.length;
        HashSet<Integer> st = new HashSet<>();
        // for(int num : arr){
        //     st.add(num);
        // }
        // System.out.println(st);

        for(int i=0;i<n;i++){
            boolean flag = false;
            if(st.contains(arr[i])){
                flag = true;
                break;
            }
            if(!flag){
                st.add(arr[i]);
            }
        }
        System.out.println(st);
    }


    public static void nonRepeat(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            // boolean flag = false;
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
        int arr[] = {4,1,5,1,2,3,4,6,9,3,2};
        nonRepeat(arr);
    }
}
