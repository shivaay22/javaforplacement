import java.util.Scanner;

public class insertin {

    public static void insertRecursively(int[] oldArr, int[] newArr, int index, int element, int i) {
        if (i == newArr.length) {
            return;
        }

        if (i < index) {
            newArr[i] = oldArr[i];
        } else if (i == index) {
            newArr[i] = element;
        } else if(i > index)
        {
            newArr[i] = oldArr[i - 1];
        }

        insertRecursively(oldArr, newArr, index, element, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5};
        int index = 2;
        int element = 100;
        int[] newArr = new int[arr.length + 1];

        insertRecursively(arr, newArr, index, element, 0);

        System.out.println("Array after insertion:");
        for (int val : newArr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
