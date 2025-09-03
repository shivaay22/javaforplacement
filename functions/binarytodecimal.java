
public class binarytodecimal {


    public static void bintodec(int num)
    {
        int bin = num;
        int pow = 0;
        int decnum = 0;

        while(num != 0)
        {
            int ld = num % 10;
            decnum = decnum + (ld * (int) Math.pow(2, pow));
            pow++;
            num = num / 10;
        }
         System.out.println("Decimal of " + bin + " = " + decnum);
    }
    
      public static void main(String args[])
    {
        int num = 101;
        int binnum = num;
        int pow = 0;
        int decnum = 0;
        while(num>0)
        {
            int ld = num % 10;
            decnum = decnum + (ld * (int)Math.pow(2,pow));

            pow++;
            num = num / 10;
        }
        System.out.println("Decimal of " + binnum + " = " + decnum);
    }
}
