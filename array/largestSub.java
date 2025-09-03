// Java program to count subarrays having sum K
// using nested loop
// import java.util.*;

public class largestSub {
    public static int countSubarrays(int[] arr, int k) {
        int res = 0;

        // Pick a starting point of the subarray
        for (int s = 0; s < arr.length; s++) {
            int sum = arr[s];
            boolean flag = false;

            // Pick an ending point
            for (int e = s+1; e < arr.length; e++) {
                sum += arr[e];
                if (sum == k)
                    // res++;
                    flag = true;
            }
            if(flag == true)
            {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarrays(arr, k));
    }
}
