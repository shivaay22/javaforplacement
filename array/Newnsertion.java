import java.util.Scanner;

public class Newnsertion {
    public static void insert(int a[], int n, int index, int element) {
        if (index < 0 || index > n) {  // Validating index
            System.out.println("Invalid index! Cannot insert.");
            return;
        }

        for (int i = n - 1; i >= index; i--) {
            a[i + 1] = a[i];  // Shift elements to the right
        }
        a[index] = element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 10]; // Allocating extra space to avoid overflow
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements to insert: ");
        int addElement = sc.nextInt();

        for (int i = 0; i < addElement; i++) {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            System.out.print("Enter position: ");
            int pos = sc.nextInt();

            // if (pos > n) {
            //     System.out.println("Invalid position! Cannot insert.");
            //     continue;
            // }

            insert(arr, n, pos, element);
            n++; // Increase size after insertion
        }

        System.out.println("Updated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close(); // Closing scanner to prevent memory leak
    }
}
