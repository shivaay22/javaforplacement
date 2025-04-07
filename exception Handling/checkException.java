import java.io.IOException;

public class checkException
{
    // void method() throws IOException
    // {
    //     throw new IOException("Device error");
    // }
    try
    {
        throw new IOException("device error");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
class Testthrows
{
    public static void main(String args[])
    {
        try
        {
        checkException ch  = new checkException();
        ch.method();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }  
    }
}