import java.util.HashSet;

public class maxTable {
    
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        int arr[] = {2,1,1,3,2,3};

        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(st.contains(num)){
                st.remove(num);
            }
            else{
                st.add(num);
                maxLen = Math.max(maxLen, st.size());
            }
        }
        System.out.println(maxLen);
    }
}
