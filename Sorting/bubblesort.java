import java.util.Scanner;
public class bubblesort
{
    public static void sort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                System.out.print("pass:" +  (i + 1) + " " + "->");
                for(int k=0;k<n;k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
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
        sort(arr, size);
    }
}