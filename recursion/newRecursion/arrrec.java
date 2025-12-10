
public class arrrec {

public static void printarr(int arr[],int i,int sum)
{
        if(i==arr.length)
        {
                System.out.println(sum);
                return;
        }
        printarr(arr, i+1,sum*arr[i]);
        // System.out.print(arr[i] + " ")

}

        public static int printfact(int n)
        {
                if(n==0)
                {
                        return 1;
                }
                int ans = n * printfact(n - 1);
                return ans;
        }

        public static int recPOW(int num,int n)
        {
                if(n == 0)
                {
                        return 1;
                }
                int ans = num * recPOW(num, n-1);
                return ans;
        }
        
        public static void digit(int n,int count)
        {
               if(n == 0)
               {
                System.out.println(count);
                return;
               }
               digit(n/10, count+1);
        }

        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
        //     printarr(arr, 0,1);
        //     System.out.println(printfact(5));
        // System.out.println(recPOW(2, 5));
                digit(12345,0);
        }    
}
