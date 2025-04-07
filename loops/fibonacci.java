import java.util.ArrayList;

public class fibonacci {
    public static ArrayList<Integer> generateFibonacciInRange(int start, int end) {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        
        int prev = 0;
        int current = 1;

        while (current <= end) {
            if (current >= start) {
                fibonacciNumbers.add(current);
            }
            int next = prev + current;
            prev = current;
            current = next;
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 10;

        ArrayList<Integer> fibonacciInRange = generateFibonacciInRange(start, end);

        System.out.println("Fibonacci numbers between " + start + " and " + end + ": ");
        for (int num : fibonacciInRange) {
            System.out.print(num + " ");
        }
    }
}
