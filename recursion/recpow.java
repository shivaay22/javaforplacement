import java.util.Scanner;
public class recpow {
    public static int rec(int n,int m)
    {
        if(m==0)
        {
            return 1;
        }
        int recpow = n*rec(n,m-1);
        return recpow;
        /*
         * Call Stack (Top to Bottom)
rec(2, 5) = 2 * rec(2, 4)
rec(2, 4) = 2 * rec(2, 3)
rec(2, 3) = 2 * rec(2, 2)
rec(2, 2) = 2 * rec(2, 1)
rec(2, 1) = 2 * rec(2, 0)
rec(2, 0) = 1 (Base Case)
Once rec(2, 0) returns 1, stack starts unwinding (values return):

rec(2, 0) = 1
rec(2, 1) = 2 * 1 = 2
rec(2, 2) = 2 * 2 = 4
rec(2, 3) = 2 * 4 = 8
rec(2, 4) = 2 * 8 = 16
rec(2, 5) = 2 * 16 = 32
         */
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        // System.out.print("Enter m: ");
        // int m = sc.nextInt();
        // System.out.println(rec(n, m));

    }
}
