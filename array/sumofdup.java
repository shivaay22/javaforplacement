public class sumofdup {
    public static int sumofdup(int[] arr) {
        int sum = 0;
        boolean[] isCounted = new boolean[arr.length]; // To track already added duplicates

        for (int i = 0; i < arr.length; i++) {
            if (isCounted[i]) {
                continue; // Skip if already processed as duplicate
            }

            boolean isDup = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                    isCounted[j] = true; // Mark duplicate
                }
            }
            if (isDup) {
                sum += arr[i];
                isCounted[i] = true; // Mark current as processed
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 42, 5, 2, 2, 2, 2, 4, 4, 4, 5, 7, 1};
        System.out.println("Sum of duplicates: " + sumofdup(arr));
    }
}
