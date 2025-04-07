public class assertion {
    public static void main(String[] args) {
        int value = 15;
        assert 15 >= 20 : " less cgpa";
        System.out.println("value is " + value);
    }
}
class Example
{
    public static void main(String[] args) {
        int age = 10;
        assert age >= 18 : "Cannot Vote";
        System.out.println("The voters age is: " + age);
    }
}
