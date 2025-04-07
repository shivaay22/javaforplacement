import java.util.ArrayList;

public class unik2 {

    public static void unik(int arr[]) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            // Check if the element is already in the list (to avoid adding duplicates)
            for (int j = 0; j < ar.size(); j++) {
                if (arr[i] == ar.get(j)) {
                    flag = true;
                    break;
                }
            }
            // If it's not a duplicate, add the element to the list
            if (!flag) {
                ar.add(arr[i]);
            }
        }
        System.out.println(ar);
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3};
        unik(arr);
    }
}

/*
 Initial Conditions:
Input array: arr[] = {1, 1, 2, 3, 3}
Empty ArrayList<Integer> ar = [] to store unique elements.
Iterations:
1st iteration (i = 0, arr[i] = 1):
flag = false (reset flag for this element).
Check if 1 is in ar. Since ar is empty, no match is found.
Action: Add 1 to ar → ar = [1].
2nd iteration (i = 1, arr[i] = 1):
flag = false (reset flag for this element).
Check if 1 is in ar.
Compare arr[i] (1) with ar[0] (1). Match found, so set flag = true and break out of the inner loop.
Action: Since flag = true, 1 is not added to ar.
3rd iteration (i = 2, arr[i] = 2):
flag = false (reset flag for this element).
Check if 2 is in ar.
Compare arr[i] (2) with ar[0] (1). No match.
Action: No match found in ar, so add 2 to ar → ar = [1, 2].
4th iteration (i = 3, arr[i] = 3):
flag = false (reset flag for this element).
Check if 3 is in ar.
Compare arr[i] (3) with ar[0] (1). No match.
Compare arr[i] (3) with ar[1] (2). No match.
Action: No match found in ar, so add 3 to ar → ar = [1, 2, 3].
5th iteration (i = 4, arr[i] = 3):
flag = false (reset flag for this element).
Check if 3 is in ar.
Compare arr[i] (3) with ar[0] (1). No match.
Compare arr[i] (3) with ar[1] (2). No match.
Compare arr[i] (3) with ar[2] (3). Match found, so set flag = true and break out of the inner loop.
Action: Since flag = true, 3 is not added to ar.
Final State of ar:
The ar list now contains [1, 2, 3].
Output:
csharp
Copy code
[1, 2, 3]
Key Points of the Dry Run:
For each element arr[i], the inner loop checks if it has already been added to the ar list.
If the element is found in the ar list (i.e., it's a duplicate), it is not added again.
Only unique elements get added to ar. Hence the result [1, 2, 3] is printed.
 */
