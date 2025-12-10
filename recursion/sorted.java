public class sorted {
    
    public static  int sort(int arr[],int size,int i)
    {
        if(i == size-1)
        {
            return 1;
        }
        if(arr[i+1] < arr[i])
        {
            return 0;
        }
        int ans = sort(arr, size, i+1);
        return ans;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int size = 5;
        System.out.println(sort(arr, size, 0));
    }
}
