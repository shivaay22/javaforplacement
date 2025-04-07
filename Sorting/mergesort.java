import java.util.*;
public class mergesort
{
    public static void merge(int a[],int si,int mid,int ei)
    {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei)
        {
            if(a[i] < a[j])
            {
            temp[k] = a[i];
            i++;
            }
            else
            {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++] = a[i++];
        }

        while(j<=ei)
        {
            temp[k++] = a[j++];
        }

        for( k=0,i=si;k<temp.length;k++,i++)
        {
            a[i] = temp[k];
        }
    }
    public static void mergesort(int a[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = (si + ei) / 2;
        mergesort(a, si, mid);
        mergesort(a, mid+1, ei);
        merge(a, si, mid, ei);
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
        mergesort(arr, 0, arr.length-1);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}