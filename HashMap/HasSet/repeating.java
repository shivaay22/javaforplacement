public class repeating {
    
    public static void repeat(int arr[]) {
        int n = arr.length;
        int count = 0; // keep outside the loop for total repeats

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            // check if arr[i] appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.print(arr[i] + " "); // print repeating element
                count++; // increase total repeats
            }
        }

        System.out.println("\nTotal repeating elements: " + count);
    }

    public static void main(String[] args) {
      int arr[] = {1,1,2,2,1,5,6,2,21,22,25,21};
        repeat(arr);
    }
}
