import java.util.Scanner;

public class reviseDeletion {
    
    public static void deletion(int arr[],int pos)
    {
        int n = arr.length;
        for(int i=pos;i<n-1;i++)
        {
            arr[i] = arr[i+1]; 
        }
        arr[n-1] = 0;
    }

    public static void newInsert(int arr[],int pos,int element)
    {
        int n = arr.length;
        // int i = 0;
        int newArr[] = new int[n  + 1];
        // int j  = 0;
        // while(i<n)
        // {
        //     if(i == pos)
        //     {
        //         newArr[i] = element;
        //     }
        //     else
        //     {
        //         arr[i] = newArr[j++];
        //     }
        //     i++;
        // }

        for(int i=0,j=0;i<n+1;i++)
        {
            if(i==pos)
            {
                newArr[i] = element;
            }
            else
            {
                newArr[i] = arr[j++];
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }


    public static void anotherInsert(int arr[],int pos,int element)
    {
        int n = arr.length;
        int i=0;
        int j=0;
        int newArr[] = new int[n+1];
        while(i<n)
        {
            if(i == pos)
            {
                newArr[i] = element;
            }
            else
            {
                // newArr[i] = arr[j++];m
            }
            i++;
        }

        for(int k=0;k<n;k++)
        {
            System.out.print(newArr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        // newInsert(arr, 2, 22);
        // newInsert(arr, 3, 45);
        anotherInsert(arr, 3, 45);
        n++;
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }
}


// int arr[] = {1,4,2,5,3,6};
        // int n = arr.length;
        // deletion(arr, 5);
        // n--;
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // System.out.println("array:ength: " + arr.length);