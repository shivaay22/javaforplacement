public class al {
    
    public static int[] uniq(int arr[]) {
        int n = arr.length;
        int newArr[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean hasDuplicate = false;
            boolean alreadyAdded = false;

            // Check ahead for duplicates
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }

            // Check if this duplicate was already stored
            for (int m = 0; m < k; m++) {
                if (newArr[m] == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            // Store only if it's a duplicate and not already added
            if (!hasDuplicate && !alreadyAdded) {
                newArr[k++] = arr[i];
            }
        }

        // Create final array of correct size
        int ansArr[] = new int[k];
        for (int i = 0; i < k; i++) {
            ansArr[i] = newArr[i];
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 1, 1, 10, 8, 9};
        int ans[] = uniq(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}

//unwanted logic