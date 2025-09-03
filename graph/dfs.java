import java.util.Arrays;

public class dfs {

    public static void arrSort(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println("dfs");
        int arr[] = {1,42,5,7,8,8,4,4,5,5,54};
        arrSort(arr);
    }
}
