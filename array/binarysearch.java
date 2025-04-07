import java.util.Scanner;
public class binarysearch {
    public static int binary(int a[],int n,int key)
    {
        int start = 0;
        int end = n - 1;
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(a[mid] == key)
            {
                return mid;
            }
            if(a[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1; 
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int index = binary(arr, size, key);
        if(index == -1)
        {
            System.out.println("Key is not found: " + index + " on = " + key);
        }
        else
        {
            System.out.println("Key is found: " + index + " on = " + key);
        }    
    }
}
