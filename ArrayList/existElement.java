import java.util.ArrayList;
import java.util.Scanner;

public class existElement {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int ele = sc.nextInt();
            arr.add(ele);
        }
        boolean ans = arr.contains(3);
        int lIdx = arr.lastIndexOf(1);
        

        System.out.println(ans);
        System.out.println(lIdx);
    }
} 
