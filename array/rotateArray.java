public class rotateArray {

    public static int rotate(int arr[], int k) {
        int rotateArr[] = new int[arr.length];
        int j = 0;
        k = k % arr.length; // Handle cases where k > arr.length
        // Copy the last k elements to the beginning
        // for (int i = arr.length - k; i < arr.length; i++) {
        //     rotateArr[j++] = arr[i];
        // }

        // // Copy the remaining elements
        // for (int i = 0; i < arr.length - k; i++) {
        //     rotateArr[j++] = arr[i];
        // }

        // return rotateArr; // Return the correct rotated array
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(arr.length);
        // int newArr[] = rotate(arr, 3);
        System.out.println(rotate(arr, 3));

        // // Print the rotated array
        // for (int i = 0; i < newArr.length; i++) {
        //     System.out.print(newArr[i] + " ");
        // }
        // System.out.println();
    }
}
