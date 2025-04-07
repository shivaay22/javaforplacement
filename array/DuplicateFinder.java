
    import java.util.Scanner;

public class DuplicateFinder {
    public static void findDuplicates(int arr[]) {
        // int[] dupArr = new int[arr.length];
        // int dupCount = 0;
        
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             // Check if the duplicate is already stored in dupArr
        //             boolean flag = false;
        //             for (int k = 0; k < dupCount; k++) {
        //                 if (arr[i] == dupArr[k]) {
        //                    flag = true;
        //                     break;
        //                 }
        //             }
        //             // If the duplicate doesn't exist in dupArr, store it
        //             if (!flag) {
        //                 dupArr[dupCount++] = arr[i];
        //             }
        //             break; // Break to avoid counting the same duplicate multiple times
        //         }
        //     }
        // }
        
        // // Print the duplicate elements found
        // for (int i = 0; i < dupCount; i++) {
        //     System.out.print(dupArr[i] + " ");
        // }
        // System.out.println();

        int duplicatesArr[] = new int[arr.length];
        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
            boolean isDuplicate = false;
            boolean isDuplicateStored = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            for(int k=0;k<count;k++)
            {
                if(duplicatesArr[k] == arr[i])
                {
                    isDuplicateStored=true;
                    break;
                }
            }

            if(isDuplicate && !isDuplicateStored)
            {
                duplicatesArr[count++] = arr[i];
            }
        }
        for(int k=0;k<count;k++)
        {
            System.out.print(duplicatesArr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 4, 2, 5, 2, 4, 4, 3, 3};
        findDuplicates(arr);
    }
}
