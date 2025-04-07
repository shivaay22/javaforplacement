import java.util.*;
public class Mq
{

    public static void max(int arr[],int size,int i,int currentMax[])
    {
        if(i == size)
        {
            return;
        }
       if(arr[i] > currentMax[0])
       {
            currentMax[0] = arr[i];
       }
       max(arr,size,i+1,currentMax);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = arr.length;
        int currMAx[] = {Integer.MIN_VALUE}; // Array used to pass value by refrence
        max(arr, size, 0, currMAx);
        System.out.println("Max: " + currMAx[0]);
    }
}