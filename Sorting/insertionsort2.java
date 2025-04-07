public class insertionsort2 {
    public static void revise(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int curr = a[i];
            int prev = i-1;
            while(prev >= 0 && a[prev] > curr)
            {
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
            for(int k=0;k<a.length;k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,1};
        revise(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
