import java.util.Scanner;
public class sumofrectangle {
    public static void sum(int a[][],int n,int m)
    {
        int sum1 = 0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum1 = sum1 + a[i][j];
            }
        }
        System.out.println("Sum1: " + sum1);
        int sum2 = 0;
        for(int i=1;i<n-1;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum2 = sum2 + a[i][j];
            }
        }
        System.out.println("Sum2: " + sum2);
        int sum3 = 0;
        for(int i=2;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum3 = sum3 + a[i][j];
            }
        }
        System.out.println("Sum3: " + sum3);
        if(sum1 > sum2 && sum1 > sum3)
        {
            System.out.println("Maxsum: " + sum1);
        }
        if(sum2 > sum3 && sum2 > sum1)
        {
            System.out.println("Maxsum: " + sum2);
        }
        if(sum3 > sum1 && sum3 > sum2)
        {
            System.out.println("Maxsum: " + sum3);
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
        sum(arr, rows, cols);
    }
}
