import java.util.HashMap;

public class countSub {

    public static int countSub2(int arr[],int k){
        
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int currSum = 0;
            for(int j=i;j<n;j++){
                currSum += arr[j];

                if(currSum == k){
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int countSubArr(int arr[], int k) {
        int n = arr.length;

        // Step 1: Create prefix sum array
        int preFix[] = new int[n];
        preFix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            preFix[i] = preFix[i - 1] + arr[i];
        }

        // Step 2: Initialize HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case for subarray starting at index 0

        int count = 0;

        // Step 3: Traverse prefix array
        for (int i = 0; i < n; i++) {
            int currSum = preFix[i];

            // check if (currSum - k) exists → means a subarray sum = k
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Step 4: Update map frequency using your pattern
            if (map.containsKey(currSum)) {
                map.put(currSum, map.get(currSum) + 1);
            } else {
                map.put(currSum, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -1, 2};
        int k = 3;

        System.out.println("Count of subarrays with sum " + k + " = " + countSubArr(arr, k));
    }
}
