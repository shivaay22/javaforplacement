import java.util.Random;
import java.util.Scanner;
// import java.util.random.*;
class game
{
    public int number;
    public int inputNumber;
    public int noofguesses = 0;

    public int getnoofguess()
    {
        return noofguesses;
    }    public void setnoofgusess(int noofguesses)
    {
        this.noofguesses = noofguesses;
    }

    game()
    {
        Random read = new Random();
        this.number = read.nextInt(100);
    }
    void userinput()
    {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean iscorrect()
    {
        noofguesses++;
        if(inputNumber == number)
        {
            System.out.println("Yes that was right num" + number);
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("Too low....");
        }
        else if(inputNumber>number)
        {
            System.out.println("Too high... ");
        }
        return false;
    }

}

public class gamequiz {
    public static void main(String[] args) {
        
        game g = new game();
        boolean b = false;
        while(!b)
        {
            g.userinput();
            b = g.iscorrect();
            // System.out.println(b);
        }
    }
}
