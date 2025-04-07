import java.util.Scanner;
public class fractionclass
{
    public static fraction add(fraction f1,fraction f2)
    {
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denomonator = f1.den * f2.den;
        fraction f3 = new fraction(numerator, denomonator);
        return f3;
    }
    public static int gcd(int num,int den)
    {
        int min = Math.min(num,den);
        for(int i=min;i>=1;i--)
        {
            if(num%i==0 && den%i==0)
            {
                return i;
            }
        }
        return min;
    }
    public static class fraction
    {
        int num;
        int den;
        fraction(int num,int den)
        {
            this.num = num;
            this.den = den;
        }
        void simplify()
        {
            int hcf = gcd(num,den);
            {
                num = num / hcf;
                den = den / hcf;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter den1: " );
        int den1 = sc.nextInt();
        fraction f1 = new fraction(num1,den1);
        System.out.println(f1.num+"/"+f1.den);
        f1.simplify();
        // System.out.print("Enter num2: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter den2: " );
        // int den2 = sc.nextInt();
        // fraction f2 = new fraction(num2, den2);
        // System.out.println(f2.num+"/"+f2.den);
        // fraction f3 = add(f1, f2);
        // System.out.println(f3.num+"/"+f3.den);
    }
}