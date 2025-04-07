import java.util.Scanner;
public class insertion2 {
    public static void insert(int a[],int n,int index,int element)
    {
        System.out.println("N: " + n);
            for(int i=n-1;i>=index;i--)
            {
                a[i+1] = a[i];
            }
            a[index] = element;
    }
    public static int[] insert2(int arr[],int n,int index,int element)
    {
        for(int i=n-1;i>=index;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[index] = element;
        return arr;
    }

    public static void insert3(int arr[], int index, int ele) {
        int n = arr.length;
        int newArr[] = new int[n + 1];  // Create new array with correct size
        int j = 0;
    
        // Copy elements before the index
        for (int i = 0; i < index; i++) {
            newArr[j++] = arr[i];
        }
    
        // Insert new element
        newArr[j++] = ele;
    
        // Copy the rest of the elements
        for (int i = index; i < n; i++) {
            newArr[j++] = arr[i];
        }
    
        // Print the result
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("N: " + n);
        // System.out.println("newSize: " + arr.length);
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        if(index > n)
        {
            System.out.println("Index not found");
            return;
        }
        System.out.print("Enter element: ");
        int element = sc.nextInt();
        // insert(arr, n, index, element);
        // int newArr[] = insert2(arr, n, index, element);
        insert3(arr, index, element);
        // n++;
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }
}
