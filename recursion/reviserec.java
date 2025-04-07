import java.util.Scanner;
public class reviserec
{
    public static int maze(int n,int m)
    {
        int RW = 0;
        int DW = 0;
        if(n==1 && m==1) return 1;
        if(n==1)
        { 
             RW += maze(n, m-1);
        }
        if(m==1)
        {
             DW += maze(n-1, m);
        }
        if(n>1 && m>1)
        {
            RW += maze(n, m-1);
            DW += maze(n-1, m);
        }
        int TW = RW + DW;
        return TW;
    }
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
    }
}