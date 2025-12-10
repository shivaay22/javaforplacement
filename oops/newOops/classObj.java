class Complex{
    int real, imag;
    void print(){
        System.out.println(real + "i \n" + imag);
    }

    Complex(int r, int i){
        real = r;
        imag = i;
    }

    void add(Complex c){
        real = real + c.real;
        imag = imag + c.imag;
    } 
}

public class classObj {
    
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        
        Complex c2 = new Complex(20, 30);

        c1.add(c2);
        // System.out.println();
        c1.print();
    }
}
