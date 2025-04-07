public class object {
    void show() //non static method needs to be called through the help of object
    {
        System.out.println("Show method");
    }
    static String call() // static method not to be called through the help of object
    {
        System.out.println();
        return "LPU";
    }
    public static void main(String[] args) {
        object o1 = new object();
        o1.show();
        System.out.println(call());
        String s = call();
        System.out.println(s);
    }
}
