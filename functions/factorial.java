// package functions;

public class factorial {
    public static int fact(int f)
    {
        int fac = 1;
        for(int i=1;i<=f;i++)
        {
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String args[])
    {
        System.out.println(fact(5));
    }
}
