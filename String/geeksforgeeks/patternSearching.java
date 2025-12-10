import java.lang.reflect.Array;
import java.util.Arrays;

public class patternSearching {
    
    public static void pattern(String str, String pat){
        int pos = str.indexOf(pat);

        while(pos >= 0){
            System.out.println(pos+" ");
            pos = str.indexOf(pat, pos+1);
        }
    }

      
    public static void search(String str, char key){
        key = 'd';
        str = "klsdnvslkkmcssdds";
        int n = str.length();
        int lastIndex = -1;

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == key){
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);

    }

    public static void digdec(String str){
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = ch.length;
        boolean flag = false;
        for(int i=0;i<n;i++){
           if(ch[i] == '.' ){
             flag = true;
           }
           else if(flag){
            sb.append(ch[i]);
           }
        }
        System.out.println(sb.toString());
    }


    public static char find(String s1, String s2){
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);

        int n = s1.length();
        for(int i=0;i<n;i++){
            if(a1[i] != a2[i]){
                return a2[i];
            }
        }
        return a2[n];
    }
    public static void main(String[] args) {
        String str = "geeks for geeks";
        // pattern(str, "geeks");
        String str2 = "65454.6564";
        // digdec(str2);
        // String s1 = "abcd";
        // String s2 = "daeca";
        // System.out.println(find(s1, s2));
        search("",' ');
    }
}
