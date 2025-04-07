class student<T>
{
    T cgpa;
    student(T cgpa)
    {
        this.cgpa = cgpa;
    }
    T getob()
    {
        return cgpa;
    }
    void showType()
    {
        System.out.println("Type of T is : " + cgpa.getClass());
    }
}

public class student2 {
    public static void main(String[] args) {
        student<Integer> iob = new student(8);
        iob.showType();
        int v = iob.getob();
        System.out.println("Value: " + v);
        student<Float> iob1 = new student(8.8f);
        iob1.showType();
        float v1 = iob1.getob();
        System.out.println("Value: " + v1);
        student<Double> iob3 = new student(8.8);
        iob3.showType();
        double v3 = iob3.getob();
        System.out.println("Value: " + v3);
    }
}
