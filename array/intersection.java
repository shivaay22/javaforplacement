import java.util.ArrayList;

public class intersection {
    public static void union(int arr1[],int arr2[])
    {
        int arr4[] = new int[Math.min(arr1.length, arr2.length)];
       ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            int element = arr1[i];
            for(int j=0;j<arr2.length;j++)
            {
                if(element == arr2[j])
                {
                    //  arr3.add(element);
                    arr4[j++] = arr2[j];
                }
            }
        }
        // System.out.println(arr3);
        for(int i=0;i<arr4.length;i++)
        {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,6,7,8}; 
        union(arr1, arr2);
    }
}
