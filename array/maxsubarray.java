import java.util.Scanner;
public class maxsubarray {
    public static void maxsubarr(int a[],int n)
    {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int start = i;
            for(int j=i;j<n;j++)
            {
                int end = j;
                for(int k=start;k<=end;k++)
                {
                    currsum += a[k];
                    System.out.print(a[k] + " ");
                }
                System.out.print(" = " + currsum);
                System.out.println();
                if(maxsum < currsum)
                {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum: " + maxsum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        maxsubarr(arr, size);
    }
}
