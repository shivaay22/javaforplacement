public class lastFirstOccur {

    public static int firstOccur(String str,char key){
        char ch[] = str.toCharArray();
        int n = ch.length;

        for(int i=0;i<n;i++){
            if(ch[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static int lastOccur(String str, char key){
        char ch[] = str.toCharArray();
        int n = ch.length;
        int lastIndex = -1;
        for(int i=0;i<n;i++){
            if(ch[i] == key){
                lastIndex = i;
            }
        }
        return lastIndex;
        
    }

    public static int fun1(String str,char key){
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == key){
                return i;
            }
        }
        return -1;
    }

    public static int fun2(String str, char key){
        int n = str.length();
        int lastIndex = -1;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == key){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        System.out.println(firstOccur(str, 'k'));

    }
}
