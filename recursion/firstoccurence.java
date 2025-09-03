import java.util.ArrayList;
import java.util.Scanner;
public class firstoccurence {
    // public static int fo(int a[],int key,int i)
    // {
    //     if(i==a.length)
    //     {
    //         return -1;
    //     }
    //     // compare
    //     if(a[i] == key)
    //     {
    //         return i;
    //     }
    //     // look forward
    //     int recans = fo(a, key, i+1);
    //     return recans;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size: ");
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     int foans = fo(arr, 3, 0);
    //     System.out.println(foans);
    // }

    public class LastOccurrence {
        public static void main(String[] args) {
            int[] arr = {1, 3, 7, 8, 7, 5, 6, 7, 9};
            int target = 7;
    
            int lastIndex = -1; // Initialize with -1 to indicate not found.
    
            // Iterate through the array
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    lastIndex = i; // Update lastIndex whenever target is found
                }
            }
            
            System.out.println(lastIndex);
            // // Output the result
            // if (lastIndex != -1) {
            //     System.out.println("The last occurrence of " + target + " is at index: " + lastIndex);
            // } else {
            //     System.out.println(target + " is not present in the array.");
            // }
        }
    }
    
    public static int ls(int a[],int i,int key)
    {
        if(i==a.length)
        {
            return -1;
        }
        int isfound = ls(a, i+1, key);
        // look forward
        if(isfound != -1)
        {
            return isfound;
        }
        // then compare
        if (a[i] == key)
        {
            return i;
        }
        int recans = ls(a, i+1, key);
        return recans;
    }

    public static int firstOccur(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void lastOccur(int arr[],int key)
    {
        ArrayList<Integer> newArr = new ArrayList<>();
        int lastIndex = -1; // Initialize with -1 to indicate not found.
    
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i; // Update lastIndex whenever target is found
                newArr.add(lastIndex);
            }
        }

        System.out.println(newArr);

        // return lastIndex;
    }

    public static int count(int arr[],int key)
    {
        int cnt = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,5,5,1,1,18,0,2,2,2,2};
        // int ans = firstOccur(arr, 2);
        // System.out.println(ans);
        // int ans2 = lastOccur(arr, 2);
        // System.out.println(ans2);
        // System.out.println("Count of 2: " + count(arr,2));
        lastOccur(arr, 1);
    } 


}
