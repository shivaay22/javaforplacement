// abstract class parent1
// {
//     parent1()
//     {
//         System.out.println("Main abstract class hoon");
//     }
//     abstract public void greet();
//     abstract public void love();
// }
// class child1 extends parent1
// {
//     public void greet()
//     {
//         System.out.println("Namaste duniya");
//     }
//     public void love()
//     {
//         System.out.println("Love you duniya");
//     }
// }

import java.util.Scanner;
abstract class Area
{
    abstract public void areaofCircle();
    abstract public void areaOfrectanggle();
}

class Areas extends Area
{
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    // int l = sc.nextInt();
    // int b = sc.nextInt();
    public void areaofCircle()
    {
        double a1 = Math.PI * (double) r * r;
        System.out.printf("%.4f%n",a1);
    }
    public void areaOfrectanggle()
    {
        // int a2 = l * b;
        // System.out.println(a2);
    }
}
public class abstractpart2 {
    public static void main(String[] args) {
        // child1 c1 = new child1();
        // c1.greet();

        Areas a1 = new Areas();
        // a1.areaOfrectanggle();;
        a1.areaofCircle();

    }
}


