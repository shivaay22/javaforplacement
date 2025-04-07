import java.util.*;

public class nextGreater {
    public static void nextMore(int arr[], int res[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2, 1, 6, 3, 4};
        int res[] = new int[arr.length];

        nextMore(arr, res);

        System.out.println("Next Greater Elements:");
        // System.out.println(Arrays.toString(res));
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}



/*
 * class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] res = new int[size1];

        for (int i = 0; i < size1; i++) {
            res[i] = -1; // Default to -1 if no greater element is found
            boolean found = false;

            for (int j = 0; j < size2; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true; // Found nums1[i] in nums2
                }
                if (found && nums2[j] > nums1[i]) { // Find next greater element
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}

First iteration (i = 0 → nums1[i] = 4)
Check nums2[j] == 4 in nums2 = [1, 3, 4, 2]:

j = 0 → nums2[0] = 1 (not 4)

j = 1 → nums2[1] = 3 (not 4)

j = 2 → nums2[2] = 4 (found in nums2)

Now look for the next greater element:

j = 3 → nums2[3] = 2 (not greater than 4)

No greater element found → res[0] = -1

Second iteration (i = 1 → nums1[i] = 1)
Check nums2[j] == 1:

j = 0 → nums2[0] = 1 (found in nums2)

Now look for the next greater element:

j = 1 → nums2[1] = 3 (greater than 1) → res[1] = 3

Third iteration (i = 2 → nums1[i] = 2)
Check nums2[j] == 2:

j = 0 → nums2[0] = 1 (not 2)

j = 1 → nums2[1] = 3 (not 2)

j = 2 → nums2[2] = 4 (not 2)

j = 3 → nums2[3] = 2 (found in nums2)

Now look for the next greater element:

No elements left in nums2 → res[2] = -1
 */