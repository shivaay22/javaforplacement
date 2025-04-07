public class strFunc {
    public static void CHAT()
    {
        String str = "Raghav";
        String str2 = "Raaj";
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.contains("ag"));
        System.out.println(str.startsWith("R"));
        System.out.println(str.endsWith("v"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(str2));
        str += 10;
        System.out.println(str);
        System.out.println(str.substring(0,2));
        String s = "hello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
        String s2 = new String("hello");
        // Always use equals
        System.out.println(s.equals(s2));
    }
    public static void subString()
    {
        String str = "Kuch";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // CHAT();
        subString();
    }
}
