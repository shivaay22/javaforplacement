abstract class Staff {
    Staff() {
        System.out.println("We can add constructor");
    }

    abstract void increment(int sal, int exp);

    void details() {
        System.out.println("You can create non-static member");
    }

    static void call() {
        System.out.println("Yes, we can create static member");
    }

    public static void main(String[] args) {
        call();
    }
}
class HR extends Staff {
    // @Override
    int inc;
    void increment(int sal, int exp) {
        if (exp > 5) {
            sal += 6000;
            System.out.println("Salary after increment is: " + sal);
        } else {
            System.out.println("Salary after increment is: " + sal);
        }
    }
    public static void main(String[] args) {
        // HR hr = new HR();
        // hr.increment(50000, 6); // Example usage of the increment method
        // Staff s1 = new Staff(); // 
        Staff s1 = new HR();
        s1.increment(70000, 7);
        };
    }

