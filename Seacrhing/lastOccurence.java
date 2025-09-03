public class lastOccurence {
    
    public static int ls(int arr[], int key){
        int n = arr.length;
        int lastIdx = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                lastIdx = i;
                // break;
            }
        }
        return lastIdx;
    }

    public static int binls(int arr[], int key){
        int n = arr.length;
        int lastIdx = -1;

        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > key) high = mid - 1;
            else if(arr[mid] < key) low = mid + 1;
            else{
                lastIdx = mid;
                low = mid + 1;
            }
        }
        return lastIdx;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,3,5,5,5,5,67,125};

        // System.out.println(ls(arr, 2));
        System.out.println(binls(arr, 5));
    }
}

/*
 * mid == 0 → when the middle element happens to be the first element of the array.

There is no left neighbor (arr[-1] would crash).

So instead of comparing with arr[mid - 1], we just assume the condition is valid from the left side.

mid == n-1 → when the middle element is the last element of the array.

There is no right neighbor (arr[n] would crash).

So instead of comparing with arr[mid + 1], we assume it’s valid from the right side.
 */
