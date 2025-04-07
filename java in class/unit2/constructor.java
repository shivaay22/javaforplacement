public class constructor
{
    String name;
    String d;
    int e;
    constructor()
    {
        System.out.println("Default constructor");
    }
    constructor(String name) // paremeterised constructor
    {
        this.name = name;// use this var_name to mention the context when the local var and instance var are of same name
        // use this as the first statement always and it will pass the control to the constructor then after that the ext stataement will be executed
        System.out.println(name);
        System.out.println(d);
    }
    constructor(String name,String department)
    {
        this(name);//constructor chaining calling the constructor to intialize name so that u can reuse the statemnent by directly calling it
        d=department;
        System.out.println(d);
    }
    constructor(String name,String department,int experience)
    {
        this(name, department);//constructor chainning calling the constructor to initialize name and separtment so that u can reuse the statement by directly calling it
        d=department;
        e=experience;
        System.out.println(e);
    }
    public static void main(String[] args) {
        constructor c1 = new constructor("Nisha","cse");
        constructor c2 = new constructor("Nisha","cse",5);
    }
}