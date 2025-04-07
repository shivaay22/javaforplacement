import java.util.Scanner;

public class findindex {
    
    public static int findI(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
        int i = 0;
        while(start<=end)
        {
            if(arr[i] == key)
            {
                return i;
            }
            i++;
        }
        return - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,9,12,16,18,22};
        System.out.println("Indices is : " + findI(arr, 16));
    }
}
