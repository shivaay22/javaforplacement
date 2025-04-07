public class part3 {

    public static int[] nonRepeating(int arr[]) {
        int n = arr.length;
        int newArr[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check every other element
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, store it
            if (!isDuplicate) {
                newArr[k++] = arr[i];
            }
        }

        // Copy valid part of array
        int ansArr[] = new int[k];
        for (int i = 0; i < k; i++) {
            ansArr[i] = newArr[i];
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 1, 1, 10, 8, 9};
        int ans[] = nonRepeating(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
