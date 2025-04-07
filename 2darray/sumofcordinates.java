import java.util.Scanner;

public class sumofcordinates {
    
    public static void sum(int a[][],int n,int m)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum = sum + a[i][j];
            }
        }
        System.out.println("Sum: " + sum);
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
        sum(arr, rows, cols);
    }
}
