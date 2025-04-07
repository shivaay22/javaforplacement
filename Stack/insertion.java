import java.util.Scanner;
import java.util.*;

public class insertion {
    
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
        int element = 22;

        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx)
        {
            temp.push(st.pop());
        }
        System.out.println("Before insertion");
        System.out.println(temp);
        System.out.println("After insertion");
        st.push(element);
        System.out.println(st);
        while(temp.size()>0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
