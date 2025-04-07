import java.util.Scanner;
public class distict {
    
    public static void duplicate(int a[])
    {
        int count = 1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] != a[i+1])
            {
                count++;
            }
        }
        System.out.println("Count: " + count);
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
        duplicate(arr);
    }
}
