import java.util.LinkedList;
import java.util.Queue;
// import java.util.Stack;

public class reverseQueue {
    
    public static void main(String[] args) {
         Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println(q1);
        System.out.println(q1.peek());
        q1.add(22);
        System.out.println(q1);


        // Stack<Integer> s1 = new Stack<>();
        // while(q1.size() != 0)
        // {
        //     s1.add(q1.poll());
        // }

        // while(s1.size() != 0)
        // {
        //     q1.add(s1.pop());
        // }

        // System.out.println(q1);
    }
}
