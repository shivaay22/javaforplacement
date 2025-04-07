import java.util.Scanner;
public class reversestring {
    public static void revers(char a[])
    {
        int start = 0;
        int end = a.length-1;
        while(start<end)
        {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char chararray[] = str.toCharArray();
        revers(chararray);
        String reveString = new String(chararray);
        System.out.println(reveString);
    }
}


// public class reversestring {
//     public static void main(String[] args) {
//         String str = "Don";
//         String str1 = "";

//         for(int i=str.length()-1; i>=0; i--) {
//             str += str.charAt(i);
//         }
//         System.out.println(str1);
//     }
// }