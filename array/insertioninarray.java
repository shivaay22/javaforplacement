import java.util.Scanner;
public class insertioninarray
{
    public static void insertion(int a[],int n,int index,int element)
    {
        //arr = {1, 2, 3, 4, 5, 0}  // The last element is a placeholder (0).

        for(int i=n-1;i>=index;i--)
        {
            a[i + 1] = a[i];
        }
        a[index] = element;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size+10];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        insertion(arr, size, 2, 22);
        size++;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr.length);
    }
}