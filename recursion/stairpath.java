import java.util.Scanner;
public class stairpath {
    public static int stair(int n)
    {
        if(n == 0)
        {
            return 1;
        }
       if(n==1)
       {
        return 1;
       }
       if(n==2)
       {
        return 2;
       }
       int recans = stair(n-1) + stair(n-2);
       return recans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int noofways = stair(n);
        System.out.println(noofways);
    }
}
