import java.util.Scanner;

public class pairsarray {
    public static void  pairs(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int curr = a[i];
            for(int j=i+1;j<n;j++)
            {
                System.out.print("(" + curr + "," + a[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        pairs(arr, size);
    }
}
