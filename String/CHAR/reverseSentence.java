public class reverseSentence {

    public static void reverse(String str){

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);

            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;

            start++;
            end--;
        }

        System.out.println(str);
    }
    
    public static void main(String[] args) {

        String str = "I am Bhardwaj Jee";
        String rev = "dccdc";
        reverse(rev);

        StringBuilder sb = new StringBuilder();
        String ans = "";
        
        int n = str.length();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans += sb;
        // System.out.println(ans);
    }
}
