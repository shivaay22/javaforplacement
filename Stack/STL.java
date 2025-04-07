import java.util.Stack;

public class STL
{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(98);
        st.push(5);
        st.push(5);
        System.out.println(st);
        System.out.println(st.peek());
        while(st.size()!=0)
        {
            int reverse = st.pop();
            System.out.print(reverse + " ");
        }
        System.out.println();

    }
}