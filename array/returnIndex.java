public class returnIndex {
    
    public static int idx(int arr[])
    {
       for(int i=0;i<arr.length;i++){
        boolean flag = false;
        for(int j=i+1;j<arr.length;i++)
        {
            if(arr[i] == arr[j])
            {
                flag = true;
                return i+1;
            }
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,3,5,6};
        System.out.println(idx(arr));
    }
}
