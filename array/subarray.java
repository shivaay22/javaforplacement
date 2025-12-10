import java.util.Scanner;
import java.util.*;
public class subarray {
    public static int sub(int a[],int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int start = i;
            for(int j=i;j<n;j++)
            {
                int end = j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(a[k] + " ");
                    // sum = sum + a[k];
                    if(a[k]%2 != 0)
                    {
                        sum = sum + a[k];
                    }
                    // if(k%2 != 0){
                    //     sum += a[k];
                    // }
                }
                System.out.println();
            }
        }
        return sum;
    }

    public static int sum(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                int len = end - start + 1;

               if(len % 2 != 0){
                    for(int k=start;k<=end;k++){
                        sum += arr[k];
                    }
               }
            }
        }
        return sum;
    }

    public static int fun3(int arr[]){
        // ArrayList<Integer> newArr = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                
                if(arr[start] != arr[end]){
                    count += 1;
                    sum = sum + (count * count);
                }
            }
        }
        return count;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        // sub(arr, size);
        // System.out.println(sub(arr, size));
        System.out.println(fun3(arr));
    }
}


/*
 Outer Loop (i=0): Start at index 0
-------------------------------------------------
  j = 0: Subarray [1] → Inner Loop (k=0) → 1
  j = 1: Subarray [1, 2] → Inner Loop (k=0 to 1) → 1 2
  j = 2: Subarray [1, 2, 3] → Inner Loop (k=0 to 2) → 1 2 3

Outer Loop (i=1): Start at index 1
-------------------------------------------------
  j = 1: Subarray [2] → Inner Loop (k=1) → 2
  j = 2: Subarray [2, 3] → Inner Loop (k=1 to 2) → 2 3

Outer Loop (i=2): Start at index 2
-------------------------------------------------
  j = 2: Subarray [3] → Inner Loop (k=2) → 3

 */