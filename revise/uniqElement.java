public class uniqElement {

    public static int[] repeatingVal(int arr[]) {
        int n = arr.length;
        int newArr[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            // check if arr[i] is repeated
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            // check if already added in newArr
            boolean alreadyAdded = false;
            for (int x = 0; x < k; x++) {
                if (newArr[x] == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (flag && !alreadyAdded) {
                newArr[k++] = arr[i];
            }
        }

        // create result array of exact size
        int ansArr[] = new int[k];
        for (int i = 0; i < k; i++) {
            ansArr[i] = newArr[i];
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 5, 5, 1, 2};
        int ans[] = repeatingVal(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
