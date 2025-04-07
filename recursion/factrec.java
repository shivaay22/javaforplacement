import java.util.Scanner;
public class factrec {
    public static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int recans = n * fact(n-1);
        return recans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
