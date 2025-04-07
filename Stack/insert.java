import java.util.Scanner;
import java.util.Stack;
public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        int idx = 2;
        int x = 22;
        
        Stack<Integer> temp = new Stack<>();
        for(int i=1;i<=idx;i++)
        {
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()!=0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
