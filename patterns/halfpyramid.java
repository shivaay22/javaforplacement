// package patterns;

public class halfpyramid {
    public static void main(String args[])
    {
        int n = 4; 
        // for(int line=1;line<=n;line++)
        // {
        //     for(int number=1;number<=line;number++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<4;i++)
        // {
        //     for(int j=i;j<4;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<4;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
