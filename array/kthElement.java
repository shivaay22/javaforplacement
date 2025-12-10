import java.lang.reflect.Array;
import java.util.Arrays;

public class kthElement {
    public static int  smallest(int arr[],int k)
    {
        Arrays.sort(arr);
       return arr[k];
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        System.out.println(smallest(arr,2));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
