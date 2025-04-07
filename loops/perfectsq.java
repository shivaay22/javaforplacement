public class perfectsq {
    // public static void main(String[] args) {
        
    //     for(int i=1;i<=13;i++)
    //     {
    //         int sqrt = (int) Math.sqrt(i);
    //         if(sqrt * sqrt == i)
    //         {
    //             System.out.print(i+" ");
    //         }
    //         // System.out.println(sqrt);
    //     }
    //     System.out.println();
    // }
    

    public static void numsq(int n)
    {
        for(int i=0;i<n;i++)
        {
            int sqrt = (int) Math.sqrt(i);
            
            if(sqrt * sqrt == i)
            {
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        int n = 13;
        numsq(n);
    }
}


