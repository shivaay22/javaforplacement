import java.util.Scanner;
public class triplets {
    public static void trip(int a[])
    {
        int target =  6;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=i+2;k<a.length;k++)
                {
                    if(a[i] + a[j] + a[k] == target)
                    {
                        System.out.print("(" + a[i] + "," + a[j] + "," + a[k] + ")" );
                    }
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter szie: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        trip(arr);
    }
}
