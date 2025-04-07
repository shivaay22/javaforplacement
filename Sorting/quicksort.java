import java.util.Scanner;
public class quicksort {
    public static int partion(int a[],int si,int ei)
    {
        int pivot = a[ei];
        int i = si - 1;
        for(int j=si;j<ei;j++)
        {
            if(a[j] <= pivot)
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        a[ei] = a[i];
        a[i] = temp;
        return i;
    }
    public static void quick(int a[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pidx = partion(a, si, ei);
        quick(a, si, pidx-1);
        quick(a, pidx+1, ei);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        quick(arr, 0, arr.length-1);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
