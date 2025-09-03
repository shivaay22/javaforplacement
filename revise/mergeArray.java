import java.util.Arrays;

public class mergeArray {
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int newArr[] = new int[m+n];
        for(int i=0;i<m;i++)
        {
            newArr[i] = nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            newArr[m++] = nums2[i];
        }
        Arrays.sort(newArr);
        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {2,5,6};
        merge(arr1, 3, arr2, 3);
    }
}
