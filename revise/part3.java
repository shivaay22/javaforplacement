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
                // k = k + 1;
            }
        }

        // Copy valid part of array
        int ansArr[] = new int[k];
        for (int i = 0; i < k; i++) {
            ansArr[i] = newArr[i];
            // newArr[i] = ansArr[i];

        }

        return ansArr;
    }

    public static void nonrepeating(int arr[])
    {
        int n = arr.length;
        
        int size = 0;
        int newArr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
            if (i != j && arr[i] == arr[j]) {
                flag = true;
                break;
            }
        }
            if(!flag)
            {
                newArr[size++] = arr[i];
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        int ans[] = nonRepeating(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        nonrepeating(arr);
    }
}
