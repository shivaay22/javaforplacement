import java.util.Scanner;
public class pelindrome {
    public static boolean checkpel(String str)
    {
        boolean flag = false;
        for(int i=0;i<str.length()/2;i++)
        {
            int n = str.length();
            if(str.charAt(i) == str.charAt(n-1-i))
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            return false;
        }
        return flag;
    }
    public static void main(String[] args) {
        // String str = sc.nextLine();
        System.out.println(checkpel("racecar"));
    }
}