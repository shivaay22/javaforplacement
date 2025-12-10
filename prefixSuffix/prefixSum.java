// package prefixSuffix;

public class prefixSum {

    public static int[] preSum(int arr[])
    {
        int n = arr.length;
        int preArr[] = new int[n];
        preArr[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            preArr[i] = preArr[i-1] + arr[i];
        }
        return preArr;
    }

    public static int[]  preSum2(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void fun3(int arr[]){
        int n = arr.length;
        int currSum = arr[0];
        System.out.print(arr[0] + " ");
        for(int i=1;i<n;i++){
            currSum += arr[i];
            System.out.print(currSum + " ");
        }
        System.out.println();
    }
    
    public static void fun4(int arr[]){
        int n = arr.length;
        
        for(int i=n-2;i>=0;i--){
            // arr[i] = arr[i+1] + arr[i];
            arr[i] += arr[i+1];
        }
    }

    public static void fun5(int arr[]){
        int n = arr.length;
        int currSum = arr[n-1];
        for(int i=n-2;i>=0;i--){
            currSum += arr[i]; 
            System.out.print(currSum + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,6,1};
        // int ans[] = preSum(arr);
        fun4(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
