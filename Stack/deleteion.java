import java.util.Scanner;
import java.util.*;

public class deleteion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println(st);
        int idx = 3;
        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx)
        {
            temp.push(st.pop());
        }
        st.pop();
        System.out.println("After Deletion");
        System.out.println(st);
        while(temp.size()>0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
