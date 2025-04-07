import java.util.Scanner;
public class recmaze {
    public static int maze(int cr,int cc,int er,int ec)
    {
        int rightways = 0;
        int downways = 0;
        if(cr==er && cc == ec)
        {
            return 1;
        }
        if(cr==er)
        {
            rightways += maze(cr, cc+1, er, ec);
        }
        if(cc==ec)
        {
            downways += maze(cr+1, cc, er, ec);
        }
        if(cr<er && cc<ec)
        {
            rightways += maze(cr, cc+1, er, ec);
            downways += maze(cr+1, cc, er, ec);
        }
        int totalways = rightways + downways;
        return totalways;
    }
    public static void main(String at[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter cols: ");
        int m = sc.nextInt();
        int tw = maze(1, 1, n, m);
        System.out.println("TW: " + tw);
    }
}
