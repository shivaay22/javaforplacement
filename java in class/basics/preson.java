class preson
{
    String name;//Instance var will be called with the help of object
    static int countperson;//class var will be accessed directly without object n if u want to call it in other class then use class name.var name
    void get(String name)// its a non static method do to call this u need a object
    {
        this.name = name;
        System.out.println(name);
        countperson = 10;
    }
public static void main(String[] args) {
    preson p1 = new preson();
    p1.get("Nikhil");
    // preson p2 = new preson();
    // p2.get("Nikhil");
    // preson p3 = new preson();
    // p3.get("Nikhil");
    System.out.println(countperson);
}
}