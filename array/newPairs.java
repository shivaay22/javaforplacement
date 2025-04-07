public class newPairs {

    public static void pairs(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int ele = arr[i];

            for(int j=i;j<arr.length;j++)
            {
                int ele2 = arr[j];

                // for(int k=j+1;k<arr.length;k++)
                // {
                //     System.out.println(ele + " " + ele2 + " " + arr[k]+ " ");
                // }
                for(int k = ele;k<ele2;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
       
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        pairs(arr);
    }
}
