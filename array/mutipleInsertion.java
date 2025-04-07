import java.util.Scanner;
public class mutipleInsertion {
    public static void insert(int arr[],int size,int pos,int element)
    {
        for(int i=size-1;i>=pos;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int size2 = sc.nextInt();
        int arr[] = new int[size + size2];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size2;i++)
        {
            System.out.print("Enter index: ");
            int idx = sc.nextInt();
            System.out.print("Enter Element: ");
            int ele = sc.nextInt();
            insert(arr,size,idx, ele);
            size++;
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
