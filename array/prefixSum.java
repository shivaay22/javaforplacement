public class prefixSum {
    
    public static int[] sumOfPrefix(int arr[])
    {
        int newArr[] = new int[arr.length];
        newArr[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            newArr[i] = arr[i] + newArr[i-1];
        }

        return newArr;
        
    }

    public static void prefixSum(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i] += arr[i-1];
        }
    }



    public static void partion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i] += arr[i-1];
        }

        boolean flag = false;
        for(int i=0;i<arr.length;i++)
        {
            if(2*arr[i] == arr[arr.length-1])
            {
                flag = true;
                break;
            }
        }


        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static void partion2(int arr[]){
        int n = arr.length;

        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }

        boolean flag = false;
        for(int i=0;i<n;i++){
            if(2*arr[i] == sum){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,10};
        int n = arr.length;

        // int newarr[] = sumOfPrefix(arr);
        prefixSum(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // for(int i=0;i<newarr.length;i++)
        // {
        //     System.out.print(newarr[i] + " ");
        // }
        // System.out.println();
        // partion(arr);
        // partion2(arr);
        
    }
}
