import java.io.*;
public class MisMatchException extends Exception {
    private String n;
    MisMatchException(String n)
    {
        this.n = n;
    }
    public String toString()
    {
        return "MyMisMatchException dute to email id not match[" + n + "]";
    }
}
    class ExceptionDemo3
    {
        public static void checkMatch(String n) throws MisMatchException
        {
            System.out.println("Called checkMatch(" + n + ")");
            if(n.equals("shailja@gmail.com"))
            {
                System.out.println("Normal exit cos no exception is caught");
                throw new MisMatchException(n);
            }
        }
        public static void main(String args[])
        {
            try
            {
                checkMatch("Shailja@gmail.com");
                checkMatch("nisha@gmail.com");
            }
            catch (MisMatchException e)
            {
                System.out.println("Caught " + e);
            }
        }
    }


