import java.util.Scanner;
import java.util.Stack;
public class copystack {
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
        Stack<Integer> rt = new Stack<>();
        while(st.size()!=0)
        {
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        Stack<Integer> cp = new Stack<>();
        while(rt.size()!=0)
        {
            int cs = rt.peek();
            cp.push(cs);
            rt.pop();
            System.out.println(cs);
        }
        System.out.println(cp);
    }
}
