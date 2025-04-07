import java.util.Scanner;
public class rotated {
    public static void rotate(int a[][],int n,int m)
    {
        // transpose
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // output
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // rotate
        for(int i=0;i<n;i++)
        {
            int j = 0;
            int k = n-1;
            while(j<k)
            {
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
                j++;
                k--;
            }
        }
        // print rotate
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
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
        rotate(arr, rows, cols);
    }
}
