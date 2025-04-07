interface revise{
    public void meth1();
}
public class reviselambda {
    public static void main(String[] args) {
    revise obj = () ->
    {
        System.out.println("This is meth1");
    };
    obj.meth1();
}
}
