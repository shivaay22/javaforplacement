import java.util.Scanner;
public class newrecpow
{
    public static int rec(int x,int n)
    {
        if(n==0)
        {
            return -1;
        }
        int xmn = rec(x, n-1);
        int recans = x * xmn;
        return recans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Ans: " + rec(x, n));
    }
}