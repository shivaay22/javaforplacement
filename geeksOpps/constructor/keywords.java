// package geeksOpps.constructor;

// import javaforplacement.recursion.sorted;

public class keywords {

    private int x;
    private int y;

   final private  int count = 5;


    public keywords(){
        // this(0,0);
    }

    public keywords(int x, int y){
        this.x = x;
        this.y = y;
    }

      public int getCount() {
        return count;
    }
    public static void main(String[] args) {
        keywords k1 = new keywords();
        // System.out.println(k1.x + " " + k1.y);
        System.out.println(k1.count);
        keywords k2 = new keywords();
        System.out.println(k2.count);

        
    }
    
}
