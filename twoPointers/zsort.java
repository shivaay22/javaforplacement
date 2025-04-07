// package twoPointers;

public class zsort {
    
    public static void swap(int arr[],int i,int j)
    {
        // int i = 0;
        // int j = arr.length - 1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int arr[])
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            if(arr[left] == 1 && arr[right] == 0)
            {
                swap(arr,left,right);
                left++;
                right--;
            } 
            if(arr[left] == 0)
            {
                left++;
            }
            if(arr[right]  == 1)
            {
                right--;
            }
        }
        
        }

    public static void main(String[] args) {

        int arr[] = {0,1,0,1,0,1,0,1,0,1};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
