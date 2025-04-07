import java.util.Scanner;

public class StringBuider {
    public static void SB()
    {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.append("00");
        System.out.println(str);
        str.setCharAt(2, 'y');
        System.out.println(str);
        str.insert(2, 'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0, 2);
        System.out.println(str);
    }
    public static void toggle()
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0;i<sb.length();i++)
        {
            char ch = sb.charAt(i); //A
            boolean flag = true; //capital
            int asci = (int)ch; //65
            if(asci>=97)
            {
                flag = false;
            }
            else if(flag == true)
            {
                asci += 32;
                char dh = (char)asci;
                sb.setCharAt(i,ch);
            }
            else
            {
                asci -= 32;
                char dh = (char)asci;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);

    }
    // it is a two pointer question
    public static void palindrome()
    {
        String str = "aba";
        int i=0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag)
        {
            System.out.println("Palinfrome");
        }
        else
        {
            System.out.println("Not ");
        }
    }
    public static void palinDrome2()
    {
        String str = "racecar";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        // String s = sb + " ";
        // if(str.equals(s))
        // {
        //     System.out.println("pali");
        // }
        // else
        // {
        //     System.out.println("not");
        // }
    }
    public static void main(String[] args) {
        // SB();
        palinDrome2();
    }
}
