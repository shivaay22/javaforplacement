// package array;

import java.util.Scanner;
import java.util.Vector;
public class looparray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        Vector<Integer> ar = new Vector<>();
    }
}
