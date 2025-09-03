import java.util.*;

public class hashSer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            num.add(sc.nextInt());
        }

        System.out.println("Unique elements in the set:");
        for (Integer n : num) {
            System.out.println(n);
        }

        System.out.println(num.size());
        sc.close();
    }
}
