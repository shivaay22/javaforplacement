public class subStrings {

    public static void sub(String str){

        int n = str.length();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(str.substring(i, j+1) + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        String str = "gopi";

        int n = str.length();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(str.charAt(j));
        //     }
        //      System.out.println();
        // }

        // sub(str);


        String str2 = "6565";
        int newStr = Integer.parseInt(str2);
        
        int sum = 0;
        while(newStr != 0){
            int ld = newStr % 10;
            sum = sum + ld;
            newStr = newStr / 10;
        }
        System.out.println(sum);

        
       
    }
}
