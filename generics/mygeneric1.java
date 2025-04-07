class generic<T1, T2>
{
    int val;
    private T1 t1;
    private T2 t2;

    public generic(int val,T1 t1,T2 t2)
    {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 geT1()
    {
        return t1;
    }

    public void setT2(T2 t2)
    {
        this.t2 = t2;
    }
    public T2 geT2()
    {
        return t2;
    }

    public void setVal(int val)
    {
        this.val = val;
    }

    public int getVal()
    {
        return val;
    }
}
public class mygeneric1 {
    public static void main(String[] args) {
        generic<String,Integer> g1 = new generic(23, "Generic1",45);
        String str = g1.geT1();
        Integer str2 = g1.geT2();
        System.out.println(str2);
    }
}
