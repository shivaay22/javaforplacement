// package twoPointers;

public class oddEven {

    public static void swap(int arr[],int i,int j)
    {
        // int i = 0;
        // int j = arr.length - 1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void sortOddEven(int arr[])
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0)
            {
                swap(arr, right, left);
                left++;
                right--;
            }
            
            if(arr[left] % 2 == 0)
            {
                left++;
            }
            if(arr[right] % 2 == 1)
            {
                right--;
            }
        }

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        sortOddEven(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
