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

    
    
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,6,1};
        int ans[] = preSum2(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+ " ");
        }
        System.out.println();
    }
}
