public class longestCommon {


    public static int findLengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        int length = 0;
        return -1;
    }
        public static int findSmallestIndex(int[] nums, int length, int target) {
            int low = 0, high = length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return low;
        }
    
        

    public static void main(String[] args) {
        int arr[] = {10,9,2,5,3,7,101,18};

        int ans = findSmallestIndex(arr, arr.length, 7);
        System.out.println(ans);
    }
    
}
