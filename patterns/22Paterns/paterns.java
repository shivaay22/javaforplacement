import java.util.Scanner;
public class paterns {
    public static void print1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print3(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    

    public static void print4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || i == n || j == 0 || j == n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        print4(5);
    }
    
}
