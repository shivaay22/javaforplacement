import java.util.Scanner;

public class secondsmallest {
    
    public static void secsma(int a[],int n)
    {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] != min && a[i] < smin)
            {
                smin = a[i];
            }
        }
        System.out.print("Smin: " + smin);
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
        secsma(arr, size);
    }
}
