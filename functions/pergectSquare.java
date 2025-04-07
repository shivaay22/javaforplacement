public class pergectSquare {
    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void range(int n) {
        int a = 0;
        int b = 1;
        while (a <= n) {
            if (isFibonacci(a)) {
                System.out.print(a + " ");
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        range(10);
    }
}
