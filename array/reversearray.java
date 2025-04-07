import java.util.Scanner;
public class reversearray {
    public static void countdifferent(int a[],int n)
    {
        int count = 0;
        boolean isdis = true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] == a[j])
                {
                    isdis = false;
                    break;
                }
            }
            if(isdis)
            {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        countdifferent(arr, size);
    }
}
