public class lec1 {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);
        System.out.println(++b);//it will take the cyclic nature
        byte b1=(byte)130;//error cos its not on range and by deafult it will consider int
        System.out.println(b1);
        byte b2 = 'A';//it will hold the ascci value
        System.out.println(b2);
        byte b3 = (byte)(120+10);//again out of range so by deafult it will assume int so type casting
        System.out.println(b3);
        byte b4 = 120+7;
        System.out.println(b4);
        byte b5=10;
        byte b6=20;

        byte b7 = (byte)(b5+b6);
        System.out.println(b7);
        // short data type
        short s1 = 2000;
        short s2 = 2000;
        short s3 = (short)(s1+s2);
        System.out.println(s3);
        short s4 = 2000+2000;
        System.out.println(s4);
        short s5 = (byte)12;
        System.out.println(s5);
        // long data type
        long l2 = 12345567899L;//when it will be to large in then 1 is mandatory
        System.out.println(l2);
        int i1=(int)l2;//here u are storing long 64 bit to int 32 bit which need explicit typecasting
        System.out.println(i1);
        // float datatype
        float f1=3;
        System.out.println(f1);
        float f2=3.123456673f;//in case of decimal point write f otherwise it will give error
        String f2num = String.format("%.3f", f2);
        System.out.println(f2num);
        // System.out.printf("%.3f",f2num);
        // double data type
        double d1 = 5;
        double d2 = 5.5;
        System.out.println(d1);
        System.out.println(d2);

        d2=f2;//store float 32 bit tp double 64 bit so here implicit type casting is done so u dont need to mention the typecasting
        char c1 = 97;
        System.out.println(c1);

        char c2 = (int)(77.7);
        System.out.println(c2);
        boolean b11 = true;
        boolean b22 = !false;
        System.out.println(b11);
        System.out.println(b22);
    }
}