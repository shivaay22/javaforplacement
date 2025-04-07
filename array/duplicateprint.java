import java.util.Scanner;
public class duplicateprint {
    public static void dupprint(int a[],int n)
    {
        int uninum = 0;
        // int count = 0;

        for(int i=0;i<n;i++)
        {
            boolean isdupnum = false;
            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    isdupnum = true;
                    break;
                }
            }
            if(!isdupnum)
            {
                a[uninum++] = a[i];
            }
        }
        for(int i=0;i<uninum;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        dupprint(arr, size);
    }
}
/*
 import java.util.Scanner;

public class duplicateprint {
    public static int[] dupprint(int a[], int n) {
        int[] temp = new int[n]; // Temporary array to store unique numbers
        int uninum = 0;

        for (int i = 0; i < n; i++) {
            boolean isdupnum = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    isdupnum = true;
                    break;
                }
            }
            if (!isdupnum) {
                temp[uninum++] = a[i];
            }
        }

        // Return only the relevant portion of the array
        int[] uniqueNumbers = new int[uninum];
        for (int i = 0; i < uninum; i++) {
            uniqueNumbers[i] = temp[i];
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] uniqueNumbers = dupprint(arr, size);
        System.out.println("Unique numbers are:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

 */