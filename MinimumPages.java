public class MinimumPages {
    
    // public static void main(String[] args) {
    //     int a = 1;
    //     // int ans = 1 + Math.max(1,2);
    //     a++;
    //     int b = 1;
    //     ++b;
    //     System.out.println(a);
    //     System.out.println(b);
    // }

    public static void main(String[] args) {
        int a = 5;

        int result1 = a++; // post-increment
        System.out.println("After a++:");
        System.out.println("result1 = " + result1); // 5
        System.out.println("a = " + a);  
        System.out.println("result2 = " + result1);           // 6

        a = 5; // reset value
        int result2 = ++a; // pre-increment
        System.out.println("\nAfter ++a:");
        System.out.println("result2 = " + result2); // 6
        System.out.println("a = " + a);             // 6
    }
}

/*
 * public class IncrementDemo {
    public static void main(String[] args) {
        int a = 5;

        int result1 = a++; // post-increment
        System.out.println("After a++:");
        System.out.println("result1 = " + result1); // 5
        System.out.println("a = " + a);             // 6

        a = 5; // reset value
        int result2 = ++a; // pre-increment
        System.out.println("\nAfter ++a:");
        System.out.println("result2 = " + result2); // 6
        System.out.println("a = " + a);             // 6
    }
}

 */