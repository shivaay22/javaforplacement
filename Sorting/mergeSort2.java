public class mergeSort2 {
    
    public static void merge(int left[], int right[], int complete[]){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                complete[k] = left[i];
                i++;
            }
            else{
                complete[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            complete[k++] = left[i++];
        }

        while (j<right.length) {
            complete[k++] = right[j++];
        }
    }

    public static void mergeSort(int arr[]){
        int n = arr.length;
        if(n==1) return;
        int leftArr[] = new int[n/2];
        int rightArr[] = new int[n-n/2];

        int k = 0;
        for(int i=0;i<leftArr.length;i++){
            leftArr[i] = arr[k++];
        }

        for(int j=0;j<rightArr.length;j++){
            rightArr[j] = arr[k++];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, arr);
    }
    public static void main(String[] args) {
        int arr[] = {2,8,1,5,2,4,1,5,1,4};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


/*
mergeSort(arr)
 ├── mergeSort(leftArr)
 │     ├── mergeSort([2,8])
 │     │     ├── mergeSort([2])
 │     │     ├── mergeSort([8])
 │     │     └── merge
 │     ├── mergeSort([1,5,2])
 │     │     ├── mergeSort([1])
 │     │     ├── mergeSort([5,2])
 │     │     │     ├── mergeSort([5])
 │     │     │     ├── mergeSort([2])
 │     │     │     └── merge
 │     │     └── merge
 │     └── merge
 ├── mergeSort(rightArr)
 │     ├── mergeSort([4,1])
 │     │     ├── mergeSort([4])
 │     │     ├── mergeSort([1])
 │     │     └── merge
 │     ├── mergeSort([5,1,4])
 │     │     ├── mergeSort([5])
 │     │     ├── mergeSort([1,4])
 │     │     │     ├── mergeSort([1])
 │     │     │     ├── mergeSort([4])
 │     │     │     └── merge
 │     │     └── merge
 │     └── merge
 └── merge(leftArr, rightArr, arr)
 */