import java.util.Scanner;
public class stringarray {
   public static void str(String a[],int n)
   {
        int start = 0;
        int end = a.length - 1;
        while(start<end)
        {
            String temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
   }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextLine();
        }
        str(arr, size);
        // for(String element : arr)
        // {
        //     System.out.println(element);
        // }
     }
}