public class binSearchOC {
    
    public static int bin(int arr[],int key)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2; 
        int ans = -1;
        while(start <= end)
        {
            if(arr[mid] == key)
            {
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < key)
            {
             start = mid + 1;
            }
            else if(arr[mid] > key)
            {
                end = mid - 1;
            }
            mid = (start + end)  / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,4,5};
        System.out.println(bin(arr, 3));
    }
}
