import java.util.Scanner;

public class subarray {
    public static void sub(int a[], int n) {
        int distinctCount = 0;

        // Flag array to mark elements as visited
        boolean visited[] = new boolean[n];

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If element is not visited
            if (!visited[i]) {
                distinctCount++;
                for (int j = i + 1; j < n; j++) {
                    // If a duplicate is found
                    if (a[i] == a[j]) {
                        visited[j] = true;
                    }
                }
            }
        }
        System.out.println("Count of distinct elements: " + distinctCount);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sub(arr, size);
    }
}
