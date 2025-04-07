import java.util.Scanner;
public class maxarray {
    public static void max(int a[],int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.print("Max: " + max);
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
        max(arr, size);
    }
}
