import java.util.Scanner;
import java.util.Arrays;

public class withoutSizeGiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Read the input string
        String numstring[] = input.split(" "); // Split the input string using comma as delimiter
        // System.out.println(numstring.length);
        int nums[] = new int[numstring.length]; // Create an integer array to store the parsed numbers

        // Parse each substring and store it in the nums array
        for (int i = 0; i < numstring.length; i++) {
            nums[i] = Integer.parseInt(numstring[i].trim()); // Trim and parse each substring
        }

        Arrays.sort(nums);

        System.out.print("Enter kth LArgest: ");
        int k = sc.nextInt();
        // Print out the parsed numbers
        for (int i = 0; i < numstring.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println(nums[k]);
    }
}
