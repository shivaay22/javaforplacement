public class studentin {
    String n;
    float cgpa;
    int reg;
    studentin(String n,float cgpa,int reg)
    {
        this.n = n;
        this.cgpa = cgpa;
        this.reg = reg;
    }
}
class ToStringMethod
{
    public static void main(String[] args) {
        studentin s1 = new studentin("Rakesh", 8.8f, 1140657);
        System.out.println(s1);
    }
}
