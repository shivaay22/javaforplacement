import java.util.Scanner;
public class multiplyofmatrix {
    public static void multiply(int a[][],int m,int n,int b[][],int p,int q)
    {
        if(n!=p)
        {
            System.out.println("Matrix cannot be multiply");
        }
        else
        {
            int res[][] = new int[m][q];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 res[i][j] = 0;
                 for(int k=0;k<n;k++)
                 {
                    res[i][j] += a[i][k] * b[k][j];
                 }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1strow: ");
        int row1 = sc.nextInt();
        System.out.print("Enter 1st cols: ");
        int cols1 = sc.nextInt();
        int arr1[][] = new int[row1][cols1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter 2ndrow: ");
        int row2 = sc.nextInt();
        System.out.print("Enter 2nd cols: ");
        int cols2 = sc.nextInt();
        int arr2[][] = new int[row2][cols2];
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        multiply(arr1, row1, cols1, arr2, row2, cols2);
    }
}
