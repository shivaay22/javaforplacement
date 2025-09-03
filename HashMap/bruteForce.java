public class bruteForce {
    
    public static void main(String[] args) {
        int arr[] = {2,2,4,5,6,8,5,5,5,5,5,5,4,4,4,4,2,2,2,3,3};

        int n = arr.length;
        boolean visited[] = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(visited[i]) continue;

            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // if(count > n / 4) {
            //     // System.out.println(arr[i]);
            //     for(int k=0;k<count;k++)
            //     {
            //         System.out.print(arr[k] + " ");
            //     }
            // }

            if(count > 5) {
                System.out.println(arr[i]);
            }
        }
    }
}
