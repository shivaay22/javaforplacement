import java.util.Scanner;
public class checkeqal {
    public static int check(int a[],int n)
    {
        boolean flag = false;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    flag = true;
                    count++;
                }
            }
        }
        if(flag)
        {
            return count;
        }
        else if(!flag)
        {
            System.out.println("null");
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int  arr[] = new int[size];
        for(int i=0;i<size;i++)
        { 
            arr[i] = sc.nextInt();
        }
       System.out.println(check(arr, size));
    }
}
