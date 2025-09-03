import java.util.Scanner;

public class maxsubarray {
    public static void maxsubarr(int a[], int n) {
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currsum = 0;   // ✅ Reset sum for new subarray starting at i
            for (int j = i; j < n; j++) {
                currsum += a[j];   // ✅ Add element at j to current sum

                // Print current subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }

                System.out.print(" = " + currsum);
                System.out.println();

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum: " + maxsum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        maxsubarr(arr, size);
        sc.close();
    }
}
