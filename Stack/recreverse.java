import java.util.Scanner;
import java.util.Stack;
public class recreverse {
    public static void reverse(Stack<Integer> st)
    {
        if(st.size() == 0)
        {
            return;
        }
        int top = st.pop();
        reverse(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();

            
            st.push(x);
        }
        reverse(st);
    }
}
