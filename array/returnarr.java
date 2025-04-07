import java.util.*;
public class returnarr {
    public static int[] arr(int a[],int n)  
    {
        for(int i=0;i<a.length;i++)
        {
            a[i] = a[i] * 2;
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int cp[] = arr(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(cp[i] + " ");
        }
        System.out.println();
    }
}
