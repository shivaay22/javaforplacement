import java.util.Scanner;

public class rotatedarray {
    // public static void rotate(int a[],int n)
    // {
    //     for(int i=1,j=3;i<=j;i++,j--)
    //     {
    //         int temp = a[i];
    //         a[i] = a[j];
    //         a[j] = temp;
    //     }
    // }


    public static void rotate(int arr[],int k)
    {
        int newArr[] = new int[arr.length];
        int j = 0;
        k = k % arr.length;
        for(int i=arr.length-k;i<arr.length;i++)
        {
            newArr[j++] = arr[i];
        }

        for(int i=0;i<arr.length-k;i++)
        {
            newArr[j++] = arr[i];
        }

        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        
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
        rotate(arr, 2);
    }
}
