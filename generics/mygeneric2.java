class generic<T1,T2,T3>
{
    T1 t1;
    T2 t2;
    T3 t3;
    public generic(T1 t1,T2 t2,T3 t3)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
    public String toString()
    {
        return "[T1: " + t1 + " t2: " + t2 + " t3: " + t3 + "]";
    }
}
public class mygeneric2 {
    public static void main(String[] args) {
    generic<Integer,String,Double> g1 = new generic(21313, "dfbdg", 3213.6546);
    String str = g1.toString();
    System.out.println(str);
    }
}
