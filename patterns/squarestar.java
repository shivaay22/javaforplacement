import java.util.Scanner;

public class squarestar
{
    public static void pattern(int n,int m)
    {
        // int num = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j=j+2)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();
        pattern(row, col);
    }
}