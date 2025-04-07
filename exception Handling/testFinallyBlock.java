// public class testFinallyBlock {
//     public static void main(String[] args) {
//         try
//         {
//             int data = 25 /5;
//             System.out.println(data);
//         }
//         catch(NullPointerException e)
//         {
//             System.out.println(e);
//         }
//         finally{System.out.println("Finally block is always executed");}
//         //finally keyword is used for when you want to execute your module as mandotory then you cam use finally keyword
//         System.out.println("rest of the code....");
//     }
// }


public class testFinallyBlock {
    public static void main(String[] args) {
        try
        {
            int data = 25 /0;
            System.out.println(data);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally{System.out.println("Finally block is always executed");}
        //finally keyword is used for when you want to execute your module as mandotory then you cam use finally keyword
        System.out.println("rest of the code....");
    }
}
