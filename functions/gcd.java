// import java.util.Scanner;

public class gcd {
    public static int gcd(int num,int den)
    {
        int min = Math.min(num,den);
        for(int i=min;i>=1;i--)
        {
            if(num%i==0 && den%i==0)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.i
        int hcf = gcd(7,2);
        System.out.println(hcf);

    }
}
