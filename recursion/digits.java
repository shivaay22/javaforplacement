public class digits {
    public static void digit(int n)
    {
        int count = 1;
        if(n == 0)
        { 
            return;
        }
        // int digits = n % 10;
        //  System.out.print(digits);
        int reduct = n / 10;
        digit(reduct);

        // if (n == 0) { 
        //     return 0;  // Base case: No digits left
        // }
        // return 1 + digit(n / 10); 
    }

    public static void table(int n)
    {
        // int temp = n;
        if(n == 0)
        {
           
            return;
        }
        
         System.out.println(5 + "*" + n + " = " + 5 * n);
        table(n-1);
        // System.out.println(5 + "*" + n + " = " + 5 * n);
        
        
    }
    // public static void digit(int n)
    // {
    //     int cnt = 0;
    //     while(n != 0)
    //     {
    //         n = n / 10;
    //         cnt++;
    //     }
    //     System.out.println(cnt);
    // }
    public static void main(String[] args) {
        // int num = 647;
        // System.out.println(digit(num));
        // digit(num);
        table(10);
    }
}
