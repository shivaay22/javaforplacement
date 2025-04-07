import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("Before Adding 10: " + q1);

        // Step 1: Add 10 to the queue (at the end initially)
        q1.add(10);
        
        // Step 2: Move all previous elements to the back, keeping 10 at the front
        int size = q1.size();
        for(int i = 0; i < size - 1; i++) { // Rotate all except the new element
            q1.add(q1.remove());
        }

        System.out.println("After Adding 10 at First Position: " + q1);
    }
}
