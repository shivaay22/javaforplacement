public class zero1 {
    public static void count01(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        int i=0;
        while(start <= end)
        {
            if(arr[i] == 0)
            {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                i++;
                start++;
            }
            if(arr[i] == 1)
            {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,0};
        count01(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
