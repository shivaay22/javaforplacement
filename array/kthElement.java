import java.lang.reflect.Array;
import java.util.Arrays;

public class kthElement {
    public static int  smallest(int arr[],int k)
    {
        Arrays.sort(arr);
       return arr[k];
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,5};
        System.out.println(smallest(arr,3));

    }
}
