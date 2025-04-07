import java.util.Scanner;

public class userName {
    public static void user(String str) {
        boolean flag = false;
        if (str.matches(".*[A-Z].*") && str.matches(".*[a-z].*") && str.matches(".*\\d.*") && str.matches(".*[^A-Za-z0-9].*")) {
            flag = true;
            System.out.println(flag + " " + str);
        } else {
            System.out.println("NOT");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        user(str);
        sc.close(); // Closing scanner to prevent resource leak
    }
}
