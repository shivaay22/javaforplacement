import java.util.Scanner;

public class revise
{
    public static void insert(int arr[],int n,int pos,int elements)
    {
        for(int i=n-1;i>=pos;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos] = elements;
    }
    public static void insert2(int arr[],int pos,int element)
    {
        int j = 0;
        int newArr[] = new int[arr.length+1];
        int i = 0;
        while(i != pos)
        {
            newArr[j++] = arr[i];
        }
        newArr[pos] = element;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1,4,2,5,3,6};
        // int n = arr.length;
        // int ndata = sc.nextInt();
        // n = n + ndata;
        // for(int i=0;i<ndata;i++){
        //     System.out.print("Enter pos: ");
        //     int pos = sc.nextInt();
        //     System.out.print("Enter data: ");
        //     int data = sc.nextInt();
        //     insert(arr, n, pos, data);
        //     n++;
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // int n = sc.nextInt();
        // int arr[] = new int[n+10];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // int nData = sc.nextInt();
        // for(int i=0;i<nData;i++)
        // {
        //     int pos = sc.nextInt();
        //     int data = sc.nextInt();
        //     insert(arr, n, pos, data);
        //     n++;
        // }
        int n = sc.nextInt();
        int arr[] = new int[n];
        insert2(arr, 2, 22);
        n++;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}