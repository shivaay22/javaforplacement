public class ratMaze {

    // public static int maze(int sr,int sc,int er,int ec)
    // {
    //     if(sr>er || sc>ec)
    //     {
    //         return 0;
    //     }
    //     // if the both condition will be hitt then it will become + 1;
    //     else if(sr == er && sc==ec)
    //     {
    //         return 2;
    //     }

    //     int downWays = maze(sr+1, sc, er, ec);
    //     int rightWays = maze(sr, sc+1, er, ec);
    //     int totalways = downWays + rightWays;
    //     return totalways;

    // }

      public static void maze(int sr,int sc,int er,int ec)
    {
        if(sr>er || sc>ec)
        {
            return ;
        }
        // if the both condition will be hitt then it will become + 1;
        else if(sr == er && sc==ec)
        {
            // return 2;
            System.out.println(1);
        }

        // int downWays = maze(sr+1, sc, er, ec);
        // int rightWays = maze(sr, sc+1, er, ec);
        // int totalways = downWays + rightWays;
        
        

    }
    
    

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        maze(1, 1, rows, cols);

    }
    
}
