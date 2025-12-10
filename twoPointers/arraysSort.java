public class arraysSort {
    
    public static int[] sqaureArr(int arr[])
    {
        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        int ans[] = new int[j];

        while(i<j)
        {
            
                ans[k] = arr[j] * arr[j];
                k++;
                j--;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int newArr[] = sqaureArr(arr);
        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
