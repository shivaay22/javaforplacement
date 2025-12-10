// import java.util.Scanner;
// import java.util.Arrays;

public class mergearray {

    public static void mergeArr(int size1,int size2,int arr1[],int arr2[])
    {
        int i=0,j=0,k=0;
        int arr3[] = new int[size1 + size2];
        while(i<size1 && j<size2)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k++] = arr1[i++];
            }
            else
            {
                arr3[k++] = arr2[j++];
            }
            
        }

        while(i<size1)
        {
            arr3[k++] = arr1[i++];
        }
        while (j<size2) {
           arr3[k++] = arr2[j++]; 
        }
        System.out.println(arr3.length);
        for(int x=0;x<arr3.length;x++)
        {
            System.out.print(arr3[x] + " ");
        }
        System.out.println();
    }

    public static void mergeArr2(int arr1[],int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergeArr[] = new int[n1+n2];
        for(int i=0;i<n1;i++){
            mergeArr[i] = arr1[i];
        }
        for(int i=0;i<n2;i++){
           mergeArr[n1+i] = arr2[i];
        }

        for(int i=0;i<mergeArr.length;i++){
            System.out.print(mergeArr[i] + " ");
        }
        System.out.println();
    }

    public static void copyArray(int arr[]){
        int n = arr.length;
        // int k = 0;
        int newArr[] = new int[n];

        for(int i=0;i<n;i++){
            newArr[i] = arr[i]; 
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size1: ");
        // int size1 = sc.nextInt();
        // int arr1[] = new int[size1];
        // for(int i=0;i<size1;i++)
        // {
        //     arr1[i] = sc.nextInt();
        // }
        // System.out.print("Enter size2: " );
        // int size2 = sc.nextInt();
        // int arr2[] = new int[size2];
        // for(int i=0;i<size2;i++)
        // {
        //     arr2[i] = sc.nextInt();
        // }
        // int size3 = size1 + size2;
        // int mergearray[] = new int[size3];
        // for(int i=0;i<size1;i++)
        // {
        //     mergearray[i] = arr1[i];
        // }
        // for(int i=0;i<size2;i++)
        // {
        //     // mergearray[size1 + i] = arr2[i];
        //     mergearray[size1++] = arr2[i];
        // }
        // Arrays.sort(mergearray);
        // for(int i=0;i<size3;i++)
        // {
        //     System.out.print(mergearray[i] + " ");
        // }
        // System.out.println();

        // mergeArr(size1, size2, arr1, arr2);
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 10};

        //  mergeArr2(arr1, arr2);
        copyArray(arr2);
    }
}
