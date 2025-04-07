
public class decimalpattern {
    public static void main(String args[])
    {
        int n = 4;
        int count = 1;
        for(int line=1;line<=n;line++)
        {
            for(int number=1;number<=line;number++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
