import java.util.ArrayList;

public class unionELe {
    
    public static void unionArr(int arr1[],int arr2[],int arr3[])
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length3 = arr3.length;

        ArrayList<Integer> ar = new ArrayList<>();
        while(i<length1 && j<length2 && k<length3)
        {
            if(arr1[i] == arr2[j]  && arr2[j] == arr3[k])
            {
               ar.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
           else if(arr2[j] < arr3[k])
           {
            j++;
           }
           else
           {
            k++;
           }  
        }
        System.out.println(ar);
    }
    public static void main(String[] args) {
        int arr1[] = {1,5,10,20,40,80};
        int arr2[] = {6,7,20,80,100};
        int arr3[] = {3,4,15,20,30,70,80,120};
        unionArr(arr1, arr2, arr3);
    }
}
