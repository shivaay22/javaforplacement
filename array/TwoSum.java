public class TwoSum {
    
    public static void sum(int arr[])
    {
        int sum = 3;
        for(int i=0;i<arr.length;i++)
        {
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(curr + arr[j] == sum)
                {
                    System.out.println(curr + "," + arr[j]);
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        sum(arr);
    }
}
