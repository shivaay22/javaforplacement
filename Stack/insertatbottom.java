import java.util.Scanner;
import java.util.Stack;
public class insertatbottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        int x = 22;
        while(st.size()!=0)
        {
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()!=0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
        System.out.println(st.peek());
    }
}
