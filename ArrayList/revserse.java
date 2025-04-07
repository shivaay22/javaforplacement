import java.util.*;
public class revserse {
    public static void reverseList(ArrayList<Integer> list)
    {
        int i = 0;
        int j = list.size() - 1;
        while(i < j)
        {
            int temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }
    public static void revserseArr(int arr[])
        {
            int i = 0;
            int j = arr.length - 1;

            while(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
         arr.add(1);
         arr.add(2);
         arr.add(3);
        
        //  System.out.println(arr);
        //  reverseList(arr);
        //  System.out.println(arr);

         int size = arr.size()-1;
         System.out.println(arr.set(0,arr.get(size)));
    }
}
