// package loops;

import java.util.Scanner;

public class reverse2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ld;
        int rev = 0;
        while(num>0)
        {
            ld = num % 10;
            rev = (rev*10)+ld;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
