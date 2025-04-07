public class selectionsort {
    
    public static void selection(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int currpos = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[currpos] > a[j])
                {
                    currpos = j;
                }
            }
            int temp = a[currpos];
            a[currpos] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        selection(arr, 5);
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
