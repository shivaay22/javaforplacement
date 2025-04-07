
interface Chessplayer
{
    void moves(); //by default abdstract 
}

class queen implements Chessplayer
{
    public void moves()
    {
        System.out.println("left right upeer lower");
    }
}

class rook implements Chessplayer
{
    public void moves()
    {
        System.out.println("left right upeer lower deper");
    }
}
public class interfacebook {
    public static void main(String[] args) {
        rook r1 = new rook();
        r1.moves();
    }
}