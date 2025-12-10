 abstract class Shape{
        int color;
        int getColor() {
            return color;
        }

        Shape(int c){
            color = c;
        }
        abstract double getArea();
        abstract void draw();
    }

    class Square extends Shape{
        double side;
        Square(int c, double s){
            super(c);
            side = s;
        }

        void draw(){
            System.out.println("Drawing a circle" + color);
        }

        double getArea(){
            return side * side;
        }
    }

 public class Abstraction {    
    public static void main(String[] args) {
        Shape s1 = new Square(5, 5);
        System.out.println(s1.getArea());
    }
}
