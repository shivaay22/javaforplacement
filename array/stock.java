import java.util.Scanner;

public class stock {
    public static int stc(int price[],int n)
    {
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(buyprice < price[i])
            {
                int profit = price[i] - buyprice;
                maxprofit = profit;
            }
            else
            {
                buyprice = price[i];
            }
        }
        return maxprofit;
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
        System.out.println(stc(arr, size));
    }
}
