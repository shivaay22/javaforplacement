public class interUnion {

    public static void intersection(int arr1[],int arr2[])
    {
        int arr3[] = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;
        for(int i=0;i<arr1.length;i++)
        {
            int element = arr1[i];
            for(int j=0;j<arr2.length;j++)
            {
                if(element == arr2[j])
                {
                    arr3[k++] = arr2[j];
                    break;
                }
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr1[] = {3,9,7};
        int arr2[] = {6,5,3,9,4,5,3,9};
        intersection(arr1, arr2);
    }
}
