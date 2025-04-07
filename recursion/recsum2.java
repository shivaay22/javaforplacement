import java.util.Scanner;
public class recsum2 {
    public static int sumofn(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int recans = n + sumofn(n-1);
        return recans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
