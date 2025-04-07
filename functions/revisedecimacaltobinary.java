public class revisedecimacaltobinary {
    
    // public static void dectobin(int num)
    // {
    //     int pow = 0;
    //     int binnum = 0;
    //     int decnum = num;

    //     while(num>0)
    //     {
    //         int rem = num % 2;
    //         binnum = binnum + (rem * (int)Math.pow(10,pow));
    //         pow++;
    //         num = num / 2;
    //     }
    //     System.out.println(decnum + " = " + binnum);
    // }
    // public static void main(String args[])
    // {
    //     dectobin(5);
    // }

    public static void dectobin(int n)
    {
        int binnum = 0;
        int pow = 0;
        // int decnum = n;

        while(n != 0)
        {
            int rem = n % 2;
            binnum += (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(binnum);

    }
    public static void main(String[] args) {
        int n = 10;
        dectobin(n);
    }
}
