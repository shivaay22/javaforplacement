import java.util.Scanner;

public class areaofcircle {
    public static void main(String args[])
    {
        int r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println(area);
    }
}
