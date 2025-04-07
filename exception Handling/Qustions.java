import java.util.Scanner;
public class Qustions{
    static void checkDetails(String emailid, String password, String useremail, String userpassword) {
        try {
            if (emailid.equals(useremail) && password.equals(userpassword)) {
                System.out.println("Login Successfully");
            } else {
                throw new Exception("Login failed: Email or password incorrect");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailid = "shivambhardwaj2022@gmail.com";
        String password = "1@2@2@";
        System.out.print("Enter User email id: ");
        String useremail = sc.nextLine();
        System.out.print("Enter User Password: ");
        String userpassword = sc.nextLine();
        checkDetails(emailid, password, useremail, userpassword);
    }
}
