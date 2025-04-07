public class prefixSuffix {
    public static int sum(int arr[])
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    public static boolean prefixsuffixx(int arr[])
    {
        int totalSum = sum(arr);
        int prefSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum+=arr[i];
            int suffixSum = totalSum - prefSum;
            if(prefSum == suffixSum)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean prefixsuffix(int arr[])
    {
        int right = 0;
        int end = arr.length - 1;

        int prefSum = 0;
        int suffixSum = 0;

        while(right<end)
        {
            prefSum += arr[right];
            suffixSum += arr[end];
            if(prefSum == suffixSum)
            {
                return true;
            }

            right++;
            end--;
        }
        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {5,3,2,6,3,1};
        System.out.println(prefixsuffix(arr));

    }
}
