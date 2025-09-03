import java.util.Arrays;
import java.util.HashSet;

public class longestCon {

    public static int longestConsecutive(int arr[],HashSet<Integer> st)
    {
        int maxStreak = 0;
        for(int num : st)
        {
            if(!st.contains(num-1)) // num is starting point
            {
                int currNum = num;
                int currStreak = 1; //length

                while(st.contains(num+1))
                {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
    
    public static void main(String[] args) {
       int arr[] = {};
       HashSet<Integer> st = new HashSet<>();
       for(int num : arr)
       {
        st.add(num);
       }

    }
}
