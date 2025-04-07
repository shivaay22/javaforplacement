import java.util.Scanner;
public class sortedarray {
    // public static boolean checksorted(int a[],int i)
    // {
    //     if(i==a.length-1)
    //     {
    //         return true;
    //     }
    //     if(a[i] > a[i+1])
    //     {
    //         return false;
    //     }
    //     return checksorted(a, i+1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size: ");
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     boolean cs = checksorted(arr, 0);
    //     System.out.println(cs);
    // }

    public static boolean sorted(int arr[],int size,int i)
    {
        if(i == size-1)
        {
            return true;
        }
        else if(arr[i+1] < arr[i])
        {
            return false;
        }
        return sorted(arr, size, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2};
        int size = arr.length;
        System.out.println(sorted(arr, size, 0));
    }
}
