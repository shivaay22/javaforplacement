
public class rotate {
    public static void rotate(int arr[],int k)
    {
        int n = arr.length;
        k = k % n; // Handle if k > n
        System.out.println("k: " + k);
      
        int newArr[] = new int[n];
        int j = 0;
        

        for(int i=k;i<n;i++)
        {
            newArr[j++] = arr[i];
        }

        for(int i=0;i<k;i++)
        {
            newArr[j++] = arr[i];
        }

        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
       
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7,8,9,10};
            rotate(arr, 4);
        }    
}
