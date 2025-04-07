import java.util.Scanner;

public class minarray {
    
    public static void min(int a[],int n)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("Min: " + min);
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
        min(arr, size);
    }
}
