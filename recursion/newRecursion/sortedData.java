public class sortedData {
    
    public static boolean sorted(int arr[],int i){
        int n = arr.length - 1;
        if(i==n){
            return true;
        }
        else if(arr[i] > arr[i+1]){
            return false;
        }
        
        return sorted(arr, i+1);

    }

    public static boolean sorted2(int arr[]){
        int n = arr.length - 1;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;

    }
    public static boolean sorted3(int n){
        if(n==0){
            return true;
        }
        else if(n > 3){
            return false;
        }
        return sorted3(n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // System.out.printif(ln(sorted2(arr));
        System.out.println(sorted3(5));
    }
}
