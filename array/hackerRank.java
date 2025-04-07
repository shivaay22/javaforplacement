import java.util.Scanner;
class solution
{
    public void  rotate(int arr[],int k)
    {
        int n = arr.length;
        int newArr[] = new int[n];
        k = k % n;
        int j = 0;
        for(int i=n-k;i<n;i++)
        {
            newArr[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            newArr[j++] = arr[i];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        solution s1 = new solution();
        s1.rotate(arr, 2);
    }
}
