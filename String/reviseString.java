public class reviseString {
    public static void check(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                System.out.print(str.charAt(i) + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

    }
   public static void main(String[] args) {
    check("hiu bhknohgdifgn d,mbg nhudggmn lsoi ugbodfhojk");
   }
}
