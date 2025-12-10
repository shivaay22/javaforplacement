import java.util.*;
public class bothOccurence {

    public static List<Integer> fun1(int arr[], int key){
        ArrayList<Integer> resArr = new ArrayList<>();
        // Arrays.sort(arr);

        int n = arr.length;
        int fIdx = -1;
        int lIdx = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                if(fIdx == -1){
                    fIdx = i;
                }
                // lIdx = i;
                else if(lIdx == -1){
                    lIdx = i;
                }
            }
        }
        resArr.add(fIdx);
        resArr.add(lIdx);

        return resArr;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,6,1,4,2,1};
        System.out.println(fun1(arr, 1));
    }
}
