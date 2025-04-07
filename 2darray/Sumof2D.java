public class Sumof2D {
    
    public static void sum(int arr[][],int rows,int cols)
    {
        int sum = 0;
        for(int i=0;i<rows;i++)
        {
            // int sum = 0;
            for(int j=0;j<cols;j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        sum(arr, 3, 3);
    }
}
