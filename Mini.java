import java.util.HashSet;

public class Mini{

    public static void main(String[] args) {
        int arr[] = {6,6,6,6,6};

        HashSet<Integer> st = new HashSet<>();
        for(int ele : arr){
            st.add(ele);
        }

        for(int i=0;i<st.size();i++){
            st = arr[i];
        }

        for(int i=0;i<st.size();i++){
            System.out.print(arr[i]);
        }
    }
}