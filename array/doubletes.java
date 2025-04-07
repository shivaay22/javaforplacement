import java.util.Scanner;
public class doubletes
{
    public static void addpairs(int a[])
    {
        int sum = 5;
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] + a[j] == sum)
                {
                    System.out.print( i + "," + j);
                    System.out.println();
                    System.out.print( + a[i] + "," + a[j]);
                    count++;
                }
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
        addpairs(arr);
    }
}
