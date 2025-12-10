import java.util.HashMap;
import java.util.HashSet;

public class stringChar {
    
   public static void main(String[] args) {
         HashMap<Character,Integer> map = new HashMap<>();
        String s = "abab";
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(Character ele : map.keySet()){
            System.out.println(map.get(ele));
        }

        HashSet<Integer> st = new HashSet<>();
        for(int ele : map.values()){
            st.add(ele);
        }
        System.out.println(st.size());
   }
}
