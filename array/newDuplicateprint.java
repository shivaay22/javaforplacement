class solution
{
    public static void print(int arr[])
    {
        int n = arr.length;
        int count = 0;
        int newArr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                newArr[count++] = arr[i];
            }
        }

        for(int i=0;i<count;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}

public class newDuplicateprint {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5,7,1,23,5,1,54,4,1,2,2,52,5,1,5,54,1,5,54,1,5,5,54};
        solution.print(arr);
    }
}
