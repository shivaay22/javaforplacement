import java.util.ArrayList;

public class uniq {

    public static void unik(int arr[]) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true; // Reset the flag for each element
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i] == arr[j]) { // Ensure we're not comparing the element with itself
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                ar.add(arr[i]); // Add element only if it is unique
            }
        }
        System.out.println(ar);
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3};
        unik(arr);
    }
}

