public class primenumber {
    // public static boolean prime(int n)
    // {
    //     boolean isprime = true;
    //     for(int i=2;i<n;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             isprime = false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(prime(113));
    // }
    public static void prime(int n)
    {
        boolean flag = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("Is prime");
        }
        
    }
    public static void main(String args[])
    {
        prime(11);
    }
}
