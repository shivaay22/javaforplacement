public class newReverseArray {
    
    public static int[] revArray(int arr[])
    {
        int revaArr[] = new int[arr.length];
        int j = 0;
       for(int i=arr.length-1;i>=0;i--)
       {
            revaArr[j++] = arr[i];

       }
       return revaArr;

    }

    public static int[] newRev(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // System.out.println(revArray(arr));
        int newArr[] = newRev(arr);
        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
