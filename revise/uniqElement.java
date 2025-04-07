

public class uniqElement {
        
    public static int[] uniq(int arr[])
    {
        int n = arr.length;
        int newArr[] = new int[n];
        int k = 0;

        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for(int j=i+1;j<n;j++)
            {
                if( arr[i] == arr[j])
                {
                    flag = true;
                    break;
                }
            }
            // only break inner loop not outer loop
            if(!flag)
            {
                newArr[k++] = arr[i];
            }
        }
        int ansArr[] = new int[k];
        int size = 0;
        for(int i=0;i<k;i++)
        {
            ansArr[size++] = newArr[i];
        }
        return ansArr;
         
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 1, 1, 10, 8, 9};
        int ans[] = uniq(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
