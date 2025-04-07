import java.util.Scanner;
public class factadd {
    public static int recadd(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int recans = n + recadd(n-1);
        return recans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(recadd(n));
    }
}
