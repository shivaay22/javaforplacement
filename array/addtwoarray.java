import java.util.Scanner;
public class addtwoarray {
    public static void addarray(int a1[],int size1,int a2[],int size2)
    {
        int size3 = Math.max(size1, size2);
        int a3[] = new int[size3];
        for(int i=0;i<size1;i++)
        {
            a3[i] = a1[i];
        }
        for(int i=0;i<size2;i++)
        {
            a3[i]+=a2[i];
        }
        for(int i=0;i<size3;i++)
        {
            System.out.print(a3[i] + " ");
        }
        System.out.println();
    }

    public static void addArray(int a1[], int size1, int a2[], int size2){
        
        for(int i=0;i<size1;i++){
            a1[i] += a2[i];
        }

        for(int i=0;i<size1;i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size1: ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size2: ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        addArray(arr1, size1, arr2, size2);
    }
}
