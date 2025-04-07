import java.util.Scanner;
public class fiborec {
    public static int recfab(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        int ans1 = recfab(n-1);
        int ans2 = recfab(n-2);
        return ans1 + ans2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(recfab(n));
    }
}
