import java.util.Scanner;

public class seconlargest {
    public static void seclar(int a[],int n)
    {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] != max && a[i] > smax)
            {
                smax = a[i];
            }
        }
        System.out.print("Smax: " + smax);
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
        seclar(arr, size);
    }
}
