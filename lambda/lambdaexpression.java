//functional interface only have one method
interface lambdaa
{
    public void meth1(int a);
}
public class lambdaexpression {
    public static void main(String[] args) {
        lambdaa obj = (a) ->
        {
            System.out.println("I am method 1: " +a);
        };
        obj.meth1(6);
    }
    
}
