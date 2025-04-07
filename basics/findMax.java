public class findMax {

    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        int c = 30;
        int d = 1000;

        int ans1 = Math.max(a,b);
        int max1 = ans1;
        int ans2 = Math.max(b,c);
        int max2 = ans2;
        int maximum = Math.max(max2, max1);
        // System.out.println(maximum);
        int max4 = Math.max(Math.max(a, b) , Math.max(c, d));
        System.out.println(max4);

    }
}
