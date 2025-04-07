import java.util.Scanner;
public class totatedsorted {
    public static int search(int a[],int tar, int si,int ei)
    {
        if(si > ei)
        {
            return -1;
        }
        int mid = (si + ei) / 2;
        // case found
        if(a[mid] == tar)
        {
            return mid;
        }
        // mid on L1
        if(a[si] <= a[mid])
        {
            // case a: left
            if(a[si] <= tar && tar <= a[mid])
            {
                return search(a, tar, si, mid-1);
            }
            else
            {
                // case b : right
                return search(a, tar, mid+1, ei);
            }
        }
        // mid on L2
        else
        {
            // case c : right
            if(a[mid] <= tar && tar <= a[ei])
            {
                return search(a, tar, mid+1, ei);
            }
            else
            {
                // case d : left
                return search(a, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, 3, 0, arr.length));
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }
}
