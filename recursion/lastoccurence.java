import java.util.Scanner;
public class lastoccurence {
    // public static int ls(int a[],int i,int key)
    // {
    //     if(i==a.length)
    //     {
    //         return -1;
    //     }
    //     int isfound = ls(a, i+1, key);
    //     // look forward
    //     if(isfound != -1)
    //     {
    //         return isfound;
    //     }
    //     // then compare
    //     if (a[i] == key)
    //     {
    //         return i;
    //     }
    //     int recans = ls(a, i+1, key);
    //     return recans;
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
    //     int lsans = ls(arr, 0, 3);
    //     System.out.println(lsans);
    // }


    public static int ocl(int arr[], int i, int key) {
        if(i >= arr.length) {
            return -1; // If the index exceeds array length, return -1 indicating key not found.
        }
        if(arr[i] == key) {
            return i; // If key is found, return the index.
        }
        return ocl(arr, i + 1, key); // Otherwise, recurse with the next index.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        
        int result = ocl(arr, 0, key); // Call recursive function
        
        if(result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found.");
        }
        
        sc.close(); // Close the Scanner to avoid resource leaks.
    }
}
