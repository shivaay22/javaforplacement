public class findMaxin2Array {

    public static int findMax(int arr1[], int arr2[]) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        // Find max in the first array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }

        // Find max in the second array
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] > max2) {
                max2 = arr2[j];
            }
        }

        // Return the larger value between max1 and max2
        return (max1 > max2) ? max1 : max2;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};

        // Call the findMax function and print the result
        int maxValue = findMax(arr1, arr2);
        System.out.println("The maximum value between both arrays is: " + maxValue);
    }
}
