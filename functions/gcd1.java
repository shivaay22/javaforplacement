public class gcd1
{
    public static int gcd(int num,int den)
    {
        int min = Math.min(num, den);
        for(int i=min;i>=1;i--)
        {
            if(num%i==0 && den%i==0)
            {
                return i;
            }
        }
        return 1;
    }
    public static void simplfy(int num1,int den1)
    {
       int hcf =  gcd(num1,den1);
        num1 = num1 / hcf;
        den1 = den1 / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("num1: " + num1 + " den1: " + den1);
    }
    public static void main(String[] args) {
        System.out.println(gcd(35, 21));
        simplfy(35, 21);
    }
}