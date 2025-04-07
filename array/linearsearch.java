import java.util.Scanner;

public class linearsearch {
    public static int linear(int a[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i] == key )
            {
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int index = linear(arr, size, key);
        if(index == -1)
        {
            System.out.println("Key is not found: " + index + " = " + key);
        }
        else
        {
            System.out.println("Key is found: " + index + " = " + key);
        }
    }
}
