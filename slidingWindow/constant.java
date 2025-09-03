public class constant {
    
    public static void main(String[] args) {
        
        int arr[] = {-1,2,3,3,4,5,-1};
        int n = arr.length;
        int k = 4;
        int l = 0;
        int r = k - 1;
        int sum = 0;
        int maxSum = 0;
        while(r < n - 1){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
