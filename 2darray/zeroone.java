import java.util.Scanner;
public class zeroone {
    public static void cnt(int a[][],int n,int m)
    {
        // 1 1 0 0
        // 1 1 1 0
        // 1 1 1 1
        int maxcount = 0;
        int maxrow = -1;
        int maxcol = -1;
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<m;j++)
            {
                if(a[i][j] == 1)
                {
                    count++;
                }
                if(maxcount < count)
            {
                maxcount = count;
                maxrow = i;
                maxcol = j;
            }
            }
        System.out.println("(" + maxrow + "," + maxcol + ")" + maxcount);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        cnt(arr, rows, cols);
    }
}
