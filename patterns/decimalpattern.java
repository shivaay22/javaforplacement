
public class decimalpattern {

    public static void prepost(){
      
        int a = 5,b,c;
        b = ++a;  // a = a + 1 first, then assign
        System.out.println("Pre-increment:");
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 6

        // Reset a
        // a = 5;

        // Post-increment
        c = a++;  // assign first, then a = a + 1
        System.out.println("\nPost-increment:");
        System.out.println("a = " + a); // 6
        System.out.println("c = " + c); // 5
    }
    public static void main(String args[])
    {
        // int n = 4;
        // int count = 1;
        // for(int line=1;line<=n;line++)
        // {
        //        count++;
        //     for(int number=1;number<=line;number++)
        //     {
        //         System.out.print(count + " ");
        //         // count++;
        //     }
        //     System.out.println();
        // }
        prepost();
        for (int i = 0; i < 5;) {
            System.out.print(++i + " "); // increment then use
        }
    }
}
