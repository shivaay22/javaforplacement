class solution
{
    public void mergeArr(int arr1[],int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        int newArr[] = new int[n+m];
        int j=0;

        for(int i=0;i<arr1.length;i++)
        {
            newArr[j++] = arr1[i];
        }

        for(int i=0;i<arr2.length;i++)
        {
            newArr[j++] = arr2[i];
        }

        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public void newmergeArr(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = arr1.length;
        int m = arr2.length;
        int newArr[] = new int[n + m];

        // Merge the two arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                newArr[k++] = arr1[i++];
            } else {
                newArr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n) {
            newArr[k++] = arr1[i++];
        }

        while (j < m) {
            newArr[k++] = arr2[j++];
        }

        // Print merged array
        for (int x = 0; x < newArr.length; x++) {
            System.out.print(newArr[x] + " ");
        }
        System.out.println();
    }
}

public class newMergeArray {
    
    public static void main(String[] args) {
        int arr1[] = {2,4};
        int arr2[] = {1,3,5,7};

        solution s1 = new solution();
        s1.newmergeArr(arr1, arr2);
    }
}
