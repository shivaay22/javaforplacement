public class gfg1 {
    
    public static int search(int n, int arr[]) {
        // your code here
        int ans = -1;
        
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[i] != arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 5, 5};
        int n = arr.length;
        System.out.println(search(n, arr));
    }
}
