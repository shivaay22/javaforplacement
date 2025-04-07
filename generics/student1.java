// package generics;
class student
{
    double cgpa;
    student(double cgpa)
    {
        this.cgpa = cgpa;
    }
    double getob()
    {
        return cgpa;
    }
    void showType()
    {
        System.out.println("Type of T is " + cgpa);
    }
}
public class student1 {
    public static void main(String[] args) {
        student iob;
        iob = new student(88);
        iob.showType();
        double v = iob.getob();
        System.out.println("value : " + v);
    }
}
