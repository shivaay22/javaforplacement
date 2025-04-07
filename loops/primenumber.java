// package loops;
import java.util.Scanner;
public class primenumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = true;
        // if(num == 2)
        // {
        //     System.out.println("Prime number");
        // }
        for(int i=2;i<num;i++)
        {
            if(num % i == 0)
            {
                prime = false;
            }
        }
        if(prime)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Composite number");
        }
    }
}
