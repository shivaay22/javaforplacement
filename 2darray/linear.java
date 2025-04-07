public class linear {
    
    public static int ls(int arr[][],int rows,int cols,int key)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j] == key)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        if(ls(arr, 3, 3, 0) == 1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
