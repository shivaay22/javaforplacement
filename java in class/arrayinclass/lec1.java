import java.util.*;
public class lec1
{
    public static void array(int a[])
    {
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        int avg = sum / a.length;
        System.out.println("Average: " + avg);
        System.out.println("Totalsub: " + a.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        array(arr);
    }
}