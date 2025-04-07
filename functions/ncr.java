// package functions;
public class ncr {
    public static int fact(int n)
    {
        int factn = 1;
        for(int i=1;i<=n;i++)
        {
            factn = factn * i;
        }
        return factn;
    }
    public static int factr(int r)
    {
        int factra = 1;
        for(int i=1;i<=r;i++)
        {
            factra = factra * i;
        }
        return factra;
    }
    public static int ncr(int n,int r)
    {
        int a = fact(n);
        int b = factr(r);
        int nmr = fact(n-r);
        int binocoff = a / (b * nmr);
        return binocoff;
    }
    public static void main(String args[])
    {
        System.out.println(ncr(5, 2));
    }
    
}
