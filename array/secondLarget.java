public class secondLarget {
    
    public static int findMax(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondMax(int arr[])
    {
        int max =  findMax(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == max)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int Smax = findMax(arr);
        return Smax;
    }

    public static int thirdLargest(int arr[])
    {
        int smax =  findMax(arr);
        int i = 0;
        while(i<arr.length)
        {
            if(arr[i] == smax)
            {
                arr[i] = Integer.MIN_VALUE;
            }
            i++;
        }
        int thirdMax = findMax(arr);
        return thirdMax;

    }

    public static void main(String args[])
    {
        int arr[] = {1,4,25,3,6};
        System.out.println(findMax(arr));
        System.out.println(secondMax(arr));
        System.out.println(thirdLargest(arr));

    }
}
