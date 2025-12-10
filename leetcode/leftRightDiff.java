public class leftRightDiff {
    
    public static void leftRightDifference(int[] nums) {
        
      int m = nums.length;
        int res2[] = new int[m];
        int currSum2 = 0;
        for(int i=m-1;i>=0;i--){
           res2[i] = currSum2;
            currSum2 += nums[i];
        }

       for(int val : res2){
            System.out.print(val + " ");
       }
       System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10,4,8,3};
        leftRightDifference(arr);
    }
}
