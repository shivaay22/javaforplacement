public class binarySearch {
    public static boolean search(int arr[],int key,int s, int e) {
        if(s > e){
            return false;
        }
        int mid = (s+e) / 2;

            if(arr[mid] == key){
                return true;
            }
            else if(key < arr[mid]){
                search(arr, key, s, mid-1);
            }
            else{
                search(arr, key, mid+1, e);
            }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(search(arr, 9, 0, arr.length-1));
    }
}
