public class maxSubarr {
    
    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int n = arr.length;

        
        int maxsum  = 0;

        for(int i=0;i<n;i++){
            int currSum = 0;
            for(int j=i;j<n;j++){
                currSum += arr[j];
                maxsum = Math.max(maxsum, currSum);
            }
        }
        System.out.println(maxsum);
    }
}
