import java.util.Scanner;
public class recsum {
    public static void rec(int n,int s)
    {
        if(n==0)
        {
            System.out.println("Sum: " + s);
            return;
        }
        rec(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        rec(n, 0);
    }
}
