public class rotatedSorted {
    
    static int findMinimum(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] <= arr[n-1])
            {
                ans = mid;
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int arr[] = {3,4,5,1,2};
        System.out.println(findMinimum(arr));
    }
}


/*
 * mid = (0 + 4) / 2 = 2

arr[mid] = arr[2] = 5

Since 5 > 2, go right:

start = mid + 1 = 3

2 Second iteration:
start = 3, end = 4

mid = (3 + 4) / 2 = 3

arr[mid] = arr[3] = 1

Since 1 <= 2, update ans = 3, and search left:

end = mid - 1 = 2

Now start = 3, end = 2 → loop terminates.
(start > end) therefore

 Final Result:
ans = 3

arr[3] = 1 is the minimum element

System.out.println(findMinimum(arr)); prints 3
 */