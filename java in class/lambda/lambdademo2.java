interface c1{
    int get();//here method is asking u to return the int value
}
public class lambdademo2 {
    public static void main(String[] args) {
        c1 ob=()->10;//so directly write the val which it is asking without any curly brcaket
        //Lambdademo1 l1 = nee lamdaDEMO1;
        int t = ob.get();
        System.out.println(t);
    }
}
