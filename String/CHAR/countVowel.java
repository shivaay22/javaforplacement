public class countVowel{

    public static void main(String[] args) {
        String str = "abcdefghiAE ";
        int cnt = 0;
        String vowels = "aeiouAEIOU";
        int len = 0;


        char ch[] = str.toCharArray();

        int n = ch.length;

        for(int i=0;i<n;i++){
            if(vowels.indexOf(ch[i]) != -1){
                len+=1;
            }
        }
        System.out.println(len);
    }
}