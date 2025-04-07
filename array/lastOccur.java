public class lastOccur {
    
    public static int LO(int arr[],int key)
    {
        int lastIndex = -1;
    //    int start = 0;
       int end = arr.length-1;
       int i = 0;
       while(i<=end)
       {
            if(arr[i] == key)
            {
                lastIndex = i;
            }
            i++;
       }
       return lastIndex;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,3,3};
        System.out.println(LO(arr, 3));

    }
}
