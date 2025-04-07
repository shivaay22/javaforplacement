public class recBinary {
    public static int binSearch(int arr[],int start,int end,int key)
    {
        int mid = (start + end) / 2;
        if(start == end)
        {
            return -1;
        }
        if(arr[mid] == key)
        {
            return mid;
        }
        if(arr[mid] < key)
        {
            return binSearch(arr, mid+1, end, key);
        }
        else
        {
            return binSearch(arr, start, mid - 1, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = arr.length;
        int start = 0;
        int end = size-1;
        int key = 3;
       System.out.println("Ans: " + binSearch(arr, start, end, key));
        

    }
}
