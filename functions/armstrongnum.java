import java.util.Scanner;
public class armstrongnum {
    public static int digit(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void armnum(int n)
    {
        int temp = n;
        int sum = 0;
        int numdigit = digit(n);
        while(n>0)
        {
            int ld = n % 10;
            sum = sum + (int) Math.pow(ld,numdigit);
            n=n/10;
        }

        if(temp == sum) {
            System.out.println("Armstrong number: " + temp);
        } else {
            System.out.println("Not Armstrong number: " + temp);
        }
    }
    public static void main(String[] args) {
        armnum(371);
    }
}
