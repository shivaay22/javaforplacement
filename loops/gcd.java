public class gcd {
    public static void main(String[] args) {
        int num = 12;
        int den = 18;
        int min = Math.min(num, den);
        for(int i=min;i>=1;i--)
        {
            if(num%i==0 && den%i==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
