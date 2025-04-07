public class uniqElement {
    
    public static int uniqKey(int arr[])
    {
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            ans = ans ^ arr[i];
            //  0 ^ arr[0] ,0 ^ arr[1] ,0 ^ arr[2], 0 ^ arr[3]
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3};
        System.out.println(uniqKey(arr));
    }
}
