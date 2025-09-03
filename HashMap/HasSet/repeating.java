public class repeating {
    
    public static void repeat(int arr[]){
        
        int n = arr.length;
        for(int i = 0; i < n; i++){
        boolean flag = false;
        for(int j = 0; j < i; j++){
        if(i != j && arr[i] == arr[j]){
            flag = true;
            break;
        }
    }
    if(!flag){
        System.out.print(arr[i] + " ");
    }
}

    }

    public static void main(String[] args) {
        int arr[] = {4,1,5,1,2,3,4,6,9,3,2};
        repeat(arr);
    }
}
