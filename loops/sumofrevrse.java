// package loops;
import java.util.Scanner;
public class sumofrevrse {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int ld;
        int rev = 0;
        int sum = 0;
        while(num>0)
        {
            ld = num % 10;
            rev = (rev*10) + ld;
            sum = sum + ld;
            num = num  / 10;
            // sum = sum + rev;
        }
        System.out.println(rev);
        System.out.println(sum);
    }
    
}
