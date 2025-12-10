public class LOWTOUP {

    public static void lowertoupper(String str) {
        char ch[] = str.toCharArray();
        int n = ch.length;

        StringBuilder sb = new StringBuilder();
        if(Character.isLowerCase(ch[0])){
            sb.append(str.toLowerCase());
        }
        else{
            sb.append(str.toUpperCase());
        }

        System.out.println(sb.toString());
    }

   public static void fun2(String str) {
    int n = str.length();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
        char ch = str.charAt(i);

        if (Character.isLowerCase(ch)) {
            sb.append(Character.toUpperCase(ch)); // convert only this character
        } else {
            sb.append(Character.toLowerCase(ch)); // convert only this character
        }
    }

    System.out.println(sb.toString());
}


    public static void main(String[] args) {
        String str = "HjGjJGjhJg";
        // lowertoupper(str);
        fun2(str);
    }
}
