// package duplicates;

public class Repeating {

    public static void rep1(int n, int arr[]) {
        int newArr[] = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            // check if arr[i] is repeated
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
        
            boolean isAlreadyInserted = false;
            for(int x=0;x<size;x++){
                if(newArr[x] == arr[i]){
                    isAlreadyInserted = true;
                    break;
                }
            }
        if(!isAlreadyInserted && flag){
            newArr[size++] = arr[i];
        }
    }
        for(int i=0;i<size;i++){
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 1, 2, 5, 5,4};
       int n = arr.length;
       rep1(n, arr);

    }
}
