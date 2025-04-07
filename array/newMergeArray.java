class solution
{
    public void mergeArr(int arr1[],int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        int newArr[] = new int[n+m];
        int j=0;

        for(int i=0;i<arr1.length;i++)
        {
            newArr[j++] = arr1[i];
        }

        for(int i=0;i<arr2.length;i++)
        {
            newArr[j++] = arr2[i];
        }

        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public void newMerge(int arr1[],int arr2[])
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = arr1.length;
        int m = arr2.length;
        int newArr[] = new int[n+m];
        while(i<n  && j<m)
        {
            if(arr1[i] < arr2[j])
            {
                newArr[k++] = arr1[i];
            }
            else
            {
                newArr[k++] = arr2[j];
            }
        }

        while(i<n)
        {
            newArr[k++] = arr1[i++];
        }
        while(j<m)
        {
            newArr[k++] = arr2[j++];
        }

        for(int x=0;x<newArr.length;x++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}

public class newMergeArray {
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};

        solution s1 = new solution();
        s1.mergeArr(arr1, arr2);
    }
}
