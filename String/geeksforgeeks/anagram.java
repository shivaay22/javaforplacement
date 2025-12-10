public class anagram {

    public static boolean isPanagram(String str){
        int n = str.length();
        if(n<26){
            return false;
        }

        boolean visited[] = new boolean[26];
        for(int i=0;i<n;i++){
            char x = str.charAt(i);
            if(x >= 'a' && x <= 'z'){
                visited[x-'a']=true;
            }
            else if(x >= 'A' && x <= 'Z'){
                visited[x-'A'] = true;
            }
        }

        for(int i=0;i<26;i++){
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str = "The quick brown for jumps over the lazy dog";
    }
}
