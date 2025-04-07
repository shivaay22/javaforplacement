// class circle
// {
//     public int radius;
//     circle()
//     {
//         System.out.println("Main cricle ka non constructor hoon");
//     }
//     circle(int r)
//     {
//         this.radius = r;
//     }
// }
// class cylinder extends circle
// {
//     public int height;
//     cylinder()
//     {
//         System.out.println("Main cylinder hooon");
//     }
//     cylinder(int r,int h)
//     {
//         super(r);
//         this.height = h;
//     }
//     public double area()
//     {
//         return Math.PI*this.radius*this.height;
//     }
// }


class circle
{
    public int radius;
    circle(int radius)
    {
        this.radius = radius;
    }
}
class rectangle extends circle
{
    public int height;
    rectangle(int radius,int height)
    {
        super(radius);
        this.height = height;
    }
    public void areaofCircle()
    {
        double a1 = Math.PI * (double)  radius * radius;
        // System.out.printf("%.2f%n",a1);
        String fromat = String.format("%.4f", a1);
        System.out.println(fromat);
    }
    public void areaOfrectanggle()
    {
        int a2 = radius * height;
        System.out.println(a2);
    }
}
public class circleconstructor {
    public static void main(String[] args) {
        // cylinder c1 = new cylinder(5, 10);
        // System.out.println(c1.area());

        rectangle r1 = new rectangle(2, 5);
        r1.areaOfrectanggle();
        r1.areaofCircle();

    }
}
