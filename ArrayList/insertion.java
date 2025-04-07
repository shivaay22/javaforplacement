import java.util.ArrayList;
import java.util.Scanner;

public class insertion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            arr.add(sc.nextInt());
        } 
        System.out.println(arr);

        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr.add(2, 100);

        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        

    }
}
