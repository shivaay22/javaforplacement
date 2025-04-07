import java.util.Scanner;
public class arrayprint {
    // public static void printarr(int a[],int i)
    // {
    //     if(i==a.length)
    //     {
    //         return;
    //     }
    //     System.out.print(a[i] + " ");
    //     printarr(a, i+1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size: ");
    //     int size = sc.nextInt();
    //     int arr[] = new int[size];
    //     for(int i=0;i<size;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     printarr(arr, 0);
    // }

    public static void printarr(int arr[],int i)
    {
        if(i==arr.length)
        {
            return;
        }
        System.out.print(arr[i] + " ");
        printarr(arr, i+1);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size: ");
         int size = sc.nextInt();
         int arr[] = new int[size];
         for(int i=0;i<size;i++)
         {
            arr[i] = sc.nextInt();
         }
         printarr(arr, 0);
        
    }
}
