import java.util.Scanner;

public class prefixSum {
    
    public static int[] sumOfPrefix(int arr[])
    {
        
        for(int i=1;i<arr.length;i++)
        {
            arr[i] = arr[i-1] + arr[i]; 
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int ans[] = sumOfPrefix(arr);
        Scanner sc = new Scanner(System.in);
        int newAns[] = sumOfPrefix(arr);
        int q = sc.nextInt();
        while(q-- > 0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ansSum = newAns[r] + newAns[l-1];

            System.out.println("Sum: " + ansSum);
        }
    }
}
