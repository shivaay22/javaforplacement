public class minMax {
    public static int max(int arr[][],int rows,int cols)
    {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
        
    }

    public static int min(int arr[][],int rows,int cols)
    {
        int min = Integer.MAX_VALUE;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println(max(arr, 3, 3));
        System.out.println(min(arr, 3, 3));
    }
}
