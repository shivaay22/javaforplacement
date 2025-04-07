import java.util.Scanner;
import java.util.Stack;

public class revisestack {
    
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
        Stack<Integer> rt = new Stack<>();
        while(st.size()!=0)
        {
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        
    }
}
