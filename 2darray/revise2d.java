import java.util.Scanner;
public class revise2d {
    public static void tranpose(int a[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        tranpose(arr1, rows, cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}