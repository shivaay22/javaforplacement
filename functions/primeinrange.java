public class primeinrange {
    public static boolean prime(int n)
    {
        boolean isprime = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void range(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        range(20);
    }
}
