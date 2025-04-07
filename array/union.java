import java.util.ArrayList;

public class union {
    
    public static void add(int arr1[],int arr2[])
    {
        ArrayList <Integer> arr3 = new ArrayList<>();

        // for(int i=0;i<arr1.length;i++)
        // {
        //     arr3.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++)
        // {
        //     arr3.add(arr2[i]);
        // }

        for(int i=0;i<arr1.length;i++)
        {
            int element = arr1[i];
            for(int j=0;j<arr2.length;j++)
            {
                if(element == arr2[j])
                {
                    arr3.add(arr2[j]);
                    break;
                }
            }
        }

        System.out.println(arr3);
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {1,1,7,8,4,10};

        add(arr1, arr2);
    }
}
