import java.util.*;

class solution
{
    public static void array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        solution s1 = new solution();
        // solution.array(arr);
        s1.array(arr);
        
    }
}
