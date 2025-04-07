public class insertionsort {
    public static void insertion(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int curr = a[i];
            int prev = i-1;
            // finding correct position
            while(prev >=0 && a[prev] > curr)
            {
                a[prev+1] = a[prev];
                prev--;
            }
            // insertion
            a[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        insertion(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
