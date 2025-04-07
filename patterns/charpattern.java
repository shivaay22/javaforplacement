// package patterns;
public class charpattern {
    public static void main(String args[])
    {
        char ch = 'a';
        int n = 4;
        for(int line=1;line<=4;line++)
        {
            for(int num=1;num<=line;num++)
            {
                // ch++;
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
