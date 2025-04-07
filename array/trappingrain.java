import java.util.Scanner;

public class trappingrain {
    
    public static int traprain(int a[],int n)
    {
        int leftmax[] = new int[n];
        leftmax[0] = a[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i] = Math.max(a[i],leftmax[i-1]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = a[n-1];
        for(int i=n-2; i>=0 ; i--)
        {
            rightmax[i] = Math.max(a[i], rightmax[i+1]);
        }
        int trapwater = 0;
        for(int i=0;i<n;i++)
        {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater  += waterlevel - a[i];
        }
        return trapwater;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=1;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(traprain(arr, size));
    }
}
