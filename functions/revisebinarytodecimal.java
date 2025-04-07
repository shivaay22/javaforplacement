import java.util.Scanner;

public class revisebinarytodecimal {
    
    // public static void bintodec(int num)
    // {
    //     int pow = 0;
    //     int binnum = num;
    //     int decnum = 0;

    //     while(num>0)
    //     {
    //         int ld = num % 10;
    //         decnum = decnum + (ld * (int)Math.pow(2,pow));
    //         pow++;
    //         num = num / 10;
    //     }
    //     System.out.println(binnum + " = " + decnum);
    // }
    // public static void main(String args[])
    // {
    //     bintodec(101);
    // }


    public static void bintodec(int n)
    {
        int pow = 0;
        int decnum = 0;

        while(n!=0)
        {
            int rem =  n % 10;
            decnum += rem * (int)Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
        System.out.println(decnum);
    }
    public static void main(String[] args) {
        int n = 1010;
        bintodec(n);
    }
}
