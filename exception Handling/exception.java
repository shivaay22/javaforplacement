public class exception {
    public static void main(String args[])
    {
        System.out.println("Hello");
        try
        {
            int i = 90 / 5;
            // System.out.println(i);
            int arr[] = new int[5];
            arr[4] = 90;
        }
        catch(ArithmeticException e)
        {
            System.out.println("U have done some mistake of arithmetic expression");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("U have done some mistake of arrayOutOfBounds Exception");
        }
        catch (Exception e)
        {
            System.out.println("U have done sime mistake");
        }
        System.out.println("Bye");
    }
}


