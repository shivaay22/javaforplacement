import java.util.ArrayList;
import java.util.Scanner;

public class list1 {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     ArrayList<String> str = new ArrayList<>();
    //     while (sc.hasNextLine()) {
    //         String num = sc.nextLine();
    //         if (!num.matches("[a-zA-Z]+")) {
    //             break;
    //         }
    //         str.add(num);
    //     }
    //     System.out.println(str);

    int arr[] = {1,2,3,4,5};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            ar.add(arr[i]);
        }
        System.out.println(ar);
    }
}
