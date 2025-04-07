public class rangefibo {
    public static boolean fibo(int n)
    {
        if(n==0 || n==1)
        {
            return true;
        }
        int a = 0;
        int b = 1;
        int sum;
        while(true)
        {
            sum = a+b;
            if(sum==n)
            {
                return true;
            }
            else if(sum > n)
            {
                return false;
            }
            a = b;
            b = sum;
        }
    }
    public static void range(int n)
    {
        for(int i=0;i<n;i++)
        {
            if(fibo(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        range(13);

    }
}
