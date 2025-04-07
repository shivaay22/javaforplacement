import java.util.*;
public class revisefun {
    public static void pel(int n)
    {
        int temp = n;
        int reverse = 0;
        while(n!=0)
        {
            int ld = n  % 10;
            reverse = reverse * 10 + ld;
            n = n / 10;
        }
        if(temp == reverse)
        {
            System.out.println("pel");
        }
        else
        {
            System.out.println("Not pel");
        }        
    }
    public static void main(String[] args) {
        pel(121);
    }
}
