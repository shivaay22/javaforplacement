// import java.util.Scanner;
public class pelindrome {

    public static boolean peli(String str){
        int len = str.length();
        int i = 0;
        int j = len-1;
        boolean flag = true;

        while(i<j){
            
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        if(flag){
            // System.out.println("pelindrome");
            return true;
        }
        return false;
    }
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
        // System.out.println(checkpel("racecar"));
        // peli("racecarhjhj");
        System.out.println(peli("racecar"));
    }
}