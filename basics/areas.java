import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 5.32;
        double area = Math.PI * r * r;
        String formated = String.format("%.5f", area);
        System.out.println(formated);
    }
}
