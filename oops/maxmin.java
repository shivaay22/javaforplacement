public class maxmin {
    public static int gcd(int num,int den)
    {
        int min = Math.min(num,den);
        return min;
    }
    public static void main(String[] args) {
        System.out.println(gcd(5, 2));
    }
}
