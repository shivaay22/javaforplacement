import java.util.Scanner;
public class selectionsort2 {
    public static void revise(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int currpos = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[currpos] > a[j])
                {
                    currpos = j;
                }
            }
            int temp = a[currpos];
            a[currpos] = a[i];
            a[i] = temp;

            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,7,3};
        revise(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
