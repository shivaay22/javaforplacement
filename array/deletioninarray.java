import java.util.Scanner;

public class deletioninarray {
    public static void deletion(int a[],int n,int index)
    {
        for(int i=index;i<n-1;i++)
        {
            a[i] = a[i + 1]; 
        }
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
        // System.out.print("Enter pos: ");
        // int pos = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter pos: ");
            int pos = sc.nextInt();
            deletion(arr, size, pos);
            size--;
        }
        // deletion(arr, size, pos);
        // size--;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
