import java.util.Scanner;

public class decimaltobinary {

    // public static void decimal(int num)
    // {
    //     int decnum = num;
    //     int pow = 0;
    //     int binnum = 0;
    //     while(num>0)
    //     {
    //         int rem = num % 2;
    //         binnum = binnum + (rem * (int) Math.pow(10,pow));
    //         pow++;
    //         num = num / 2;
    //     }
    //     System.out.println(decnum + " = " + binnum);
    // }
    // public static void main(String args[])
    // {
    //     decimal(5);
    // }

   public static void dectobin(int num) {
        int decnum = num;
        int bin = 0;
        int pow = 0;

        while (num != 0) {
            int ld = num % 2;
            bin = bin + (ld * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.println(decnum + " = " + bin);
    }
    public static void main(String[] args) {
        dectobin(5);
    }
}
