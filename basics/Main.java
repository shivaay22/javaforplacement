import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(br.readLine().trim());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(br.readLine().trim());

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
