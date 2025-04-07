public class countKey {

    public static void findKey(int num,int key)
    {
        int cnt = 0;
        while(num != 0)
        {
            int ld = num % 10;
            if(ld == key)
            {
                cnt++;
            }
            num = num / 10;
        }
        System.out.println(cnt);
    }

    public static int countDigit(int num)
    {
        int count = 0;
        while(num != 0)
        {
            int ld = num % 10;
            count = count + 1;
            num = num / 10;
        }
        return count;
    }
    
    public static int maxArr(int arr[])
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
    public static void main(String[] args) {
        int num = 1232452;
        // int key = 2;
        // findKey(num, key);
       System.out.println(countDigit(num));
       int arr[] = {1,2,3,4,5};
       System.out.println(maxArr(arr));
    }
}
