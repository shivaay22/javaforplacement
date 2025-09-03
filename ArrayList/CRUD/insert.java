import java.util.*;

public class insert {
    public static void crud(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();

        // Copy array elements to ArrayList
        for (int num : arr) {
            newArr.add(num);
        }

        // Print ArrayList in order
        System.out.print("ArrayList: ");
        for (int i = 0; i < newArr.size(); i++) {
            System.out.print(newArr.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] crud(int arr[], int n)
    {
        ArrayList<Integer> newArr = new ArrayList<>();

        // Copy array elements to ArrayList
        for (int num : arr) {
            newArr.add(num);
        }

        int updateArr[] = new int[newArr.size()];

        for(int i=0;i<newArr.size();i++)
        {
            updateArr[i] = newArr.get(i);
        }
        return updateArr;
    }

    public static int[] isnertAtPosition(int arr[],int index,int elements)
    {
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num : arr)
        {
            newArr.add(num);
        }
       
        if(index >= 0 && index <= newArr.size())
        {
            newArr.add(index,elements);
        }
        else
        {
            System.out.println("Invalid index");
        }

        for(int i=0;i<newArr.size();i++)
        {
            System.out.print(newArr.get(i) + " ");
        }
        System.out.println();

        int updateArr[] = new int[newArr.size()];

        for(int i=0;i<newArr.size();i++){
            updateArr[i] = newArr.get(i);
        }
        return updateArr;

    }

    public static void deleteAtPosition(int arr[], int index) {
    ArrayList<Integer> newArr = new ArrayList<>();

    // Copy array to ArrayList
    for (int num : arr) {
        newArr.add(num);
    }

    // Check valid index and delete
    if (index >= 0 && index < newArr.size()) {
        newArr.remove(index);
    } else {
        System.out.println("Invalid index");
        return;
    }

    // Print updated ArrayList
    for (int i = 0; i < newArr.size(); i++) {
        System.out.print(newArr.get(i) + " ");
    }
    System.out.println();
}

public static void deleteByElement(int arr[], int elements)
{
     ArrayList<Integer> newArr = new ArrayList<>();

    // Copy array to ArrayList
    for (int num : arr) {
        newArr.add(num);
    }

    if(newArr.contains(elements))
    {
        newArr.remove(Integer.valueOf(elements));
    }
    else
    {
        System.out.println("Element not found");
    }

     // Print updated ArrayList
    for (int i = 0; i < newArr.size(); i++) {
        System.out.print(newArr.get(i) + " ");
    }
    System.out.println();
}
public static void updateElementByIndex(int arr[],int index, int element)
{
    ArrayList<Integer> newArr = new ArrayList<>();

    // Copy array to ArrayList
    for (int num : arr) {
        newArr.add(num);
    }

    if(index >=0 && index < newArr.size())
    {
        newArr.set(index, element);
    }

     // Print updated ArrayList
    for (int i = 0; i < newArr.size(); i++) {
        System.out.print(newArr.get(i) + " ");
    }
    System.out.println();

}
public static void updateByElement(int arr[], int oldElement, int newElement) {
    ArrayList<Integer> newArr = new ArrayList<>();

    // Step 1: Copy array to ArrayList
    for (int num : arr) {
        newArr.add(num);
    }

    // Step 2: Find and update the element
    if (newArr.contains(oldElement)) {
        int index = newArr.indexOf(oldElement);
        newArr.set(index, newElement); // Update the value at found index
    } else {
        System.out.println("Element not found.");
        return;
    }

    // Step 3: Print updated list
    System.out.print("Updated ArrayList: ");
    for (int num : newArr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[5];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // e.g., 1 2 3 4 5
        }

        // crud(arr); // Should print 1 2 3 4 5

        // int printArr[] = crud(arr, n);
        // for(int i=0;i<printArr.length;i++)
        // {
        //     System.out.print(printArr[i] + " ");
        // }
        // System.out.println();
        isnertAtPosition(arr, 3, 22);
    }
}
