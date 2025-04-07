public class exceptionHandlingDemo
{
    static void checkAge(int a)
    {
        try{
            if(a>18)
            {
                System.out.println("u can apply for license");
            }
            else
            {
                throw new Exception("Age not valid Exception");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
    public static void main(String[] args) {
        checkAge(18);
    }
}