public class palin {

    public static boolean isPalin(String str){

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
        
    }
    
    public static void main(String[] args) {
        String str = "racecar";
        // System.out.println(isPalin(str));
        System.out.println("raghav" + 10 + 20 );
        System.out.println(10 + "raghav" + 20);
        
    }
}
