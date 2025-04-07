interface c1{
    int get(int a,int b);
}
public class lemdademo3 {
    public static void main(String[] args) {
        c1 ob=(x,y)->10;
        //so here if u use :- ob = (intx,int y)->10;np issues it will work but no need to write int int
        //so here if u use :- ob =(a,b)->10; no issues it will work because it will check the no of parameter not the name
        int t = ob.get(10, 10);
        System.out.println(t);
    }
}
