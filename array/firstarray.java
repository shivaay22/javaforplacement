// package array;

import java.util.Scanner;

public class firstarray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        System.out.println("Maths: " + arr[0]);
        System.out.println("Phy: " + arr[1]);
        System.out.println("che: " + arr[2]);

        int ave = (arr[0] + arr[1] + arr[2])  / 3;
        System.out.println("Ave: " + ave);
    }
}
