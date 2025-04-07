public class pivot
{
    public static int pvtidx(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            if(start == end)
            {
                return start;
            }
            int mid =  (start + end) / 2;  // Prevent overflow

            // Check if mid is the pivot
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            // Check if the previous element is the pivot
            if(mid > start && arr[mid - 1] > arr[mid])
            {
                return mid - 1;
            }

            // Check which side is unsorted, and move the pointers accordingly
            if(arr[start] > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1; // Return -1 if no pivot is found
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 9, 7, 4, 6, 8};
        // pivot is those there sorted is break there is 9 wherse sorted order is break
        int ans = pvtidx(arr);
        System.out.println(arr[ans]);  // Should print 1 (index of 9)
    }
}
