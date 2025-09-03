import java.util.HashSet;
import java.util.Scanner;

public class unionInter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {3,9,7};
        int arr2[] = {6,3,9,2,9,4,3,9};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }

        // System.out.println(set);
        // for (Integer num : set)
        // {
        //     System.out.print(num + " ");
        // }

        set.clear();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                count++;
                intersection.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        // System.out.println(count);
        // System.out.println(intersection);
        for(Integer num : intersection)
        {
            System.out.print(num + " ");
        }
        
    }
}
