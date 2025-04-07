import java.util.Scanner;
public class sumarray {
    // public static int sum(int a[],int i)
    // {
    //     if(i==a.length)
    //     {
    //         return 0;
    //     }
    //     int ce = a[i];
    //     int sumrest = sum(a, i+1);
    //     int sum = ce + sumrest;
    //     // System.out.print(ce + " ");
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size: ");
    //     int size = sc.nextInt();
    //     int arr[] = new int[size];
    //     for(int i=0;i<size;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println(sum(arr, 0));
    // }


    public static int sum(int arr[],int size,int i)
    {  
        if(i == size)
        {
           
            return 0;
        }
    //    sumarr[0] += arr[i];
    //    sum(arr, size, i+1, sumarr);
        int ans = arr[i] += sum(arr,size,i+1);
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = arr.length;
        // int sumarr[] = {0};
        // sum(arr, size, 0,sumarr);
        // System.out.println("Sum: "+ sumarr[0]);
        System.out.println(sum(arr, size, 0));
    }
}
