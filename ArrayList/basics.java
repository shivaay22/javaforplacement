import java.util.ArrayList;
import java.util.Scanner;

public class basics {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();

        Integer i2 = Integer.valueOf(5);
        System.out.println(i2);

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        System.out.println(arr1.get(2));
        for(int i=0;i<arr1.size();i++)
        {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();

        arr1.add(2,100);
        System.out.println(arr1);
        

        arr1.set(1, 10);
        System.out.println(arr1);

        arr1.remove(0);
        System.out.println(arr1);

        arr1.remove(Integer.valueOf(100));
        System.out.println(arr1);

        boolean ans = arr1.contains(Integer.valueOf(10));
        System.out.println(ans);

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int ele = sc.nextInt();
            arr2.add(ele);
        }
        System.out.println(arr2);

        ArrayList mixArr = new ArrayList();
        mixArr.add("Kuch v");
        mixArr.add(1);
        mixArr.add(true);
        System.out.println(mixArr);



    }
}
