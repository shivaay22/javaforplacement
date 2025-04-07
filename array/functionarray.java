// package array;

import java.util.Scanner;

public class functionarray {
    public static void funcarray(int a[],int n)
    {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        n = 2;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        funcarray(arr,size);
    }
}
