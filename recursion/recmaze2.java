import java.util.Scanner;
public class recmaze2 {
    public static int maze(int n,int m)
    {
        int rightways = 0;
        int downways = 0;
        if(n==1 && m==1)
        {
            return 1;
        }
        if(n==1)
        {
            rightways+=maze(n, m-1);
        }
        if(m==1)
        {
            downways+=maze(n-1, m);
        }
        
        if(n>1 && m>1)
        {
            rightways+=maze(n, m-1);
            downways+=maze(n-1, m);
        }
        int tw = rightways + downways;
        return tw;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter cols: ");
        int m = sc.nextInt();
        int TW = maze(n, m);
        System.out.println("TW: " + TW);
    }
}
