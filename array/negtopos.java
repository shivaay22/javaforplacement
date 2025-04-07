public class negtopos {
    
    public static void postoneg(int arr[])
    {
       int l = 0;
       int h = arr.length-1;

       while(l<=h)
       {
            if(arr[l] < 0)
            {
                l++;
            }
            else if(arr[h] > 0)
            {
                h--;
            }
            else
            {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
            }
       }

    }
    public static void main(String[] args) {
        int arr[] = {1,-1,2,-2,3,-3,4,-4,5,-5};
        postoneg(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
